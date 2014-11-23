/**
 * 
 */
package com.ssk.amazon.challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author sskumar
 * 
 */
public class StuffYourFriends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StuffYourFriends test = new StuffYourFriends();

		List<String> l = test.getRank("m1");
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
	}

	public List<String> getRank(String user) {
		// This HashMap stores all products made by this customer;
		HashMap myPurchasesMap = new HashMap();
		HashMap<String, Integer> purchaseMap = new HashMap<String, Integer>();
		// Fetching friends list for the user.
		List<String> myPurchases = getPurchasesForUser(user);

		// it stores the user purchases into Map, returns null i f there no
		// purchases.
		for (Iterator<String> mypItr = myPurchases.iterator(); mypItr.hasNext();) {
			String productId = (String) mypItr.next();
			myPurchasesMap.put(productId, 1);
		}
		
		//Retrieve Friends list for the user.
		List<String> friends = getFriendsListForUser(user);
		
		//Iterate over the list friends to find out the purchases and store it's rank.
		for (Iterator<String> iterator = friends.iterator(); iterator.hasNext();) {
		
			String friend = (String) iterator.next();
			
			//retrieve list of purchases for the friend.
			List<String> friendPurchases = getPurchasesForUser(friend);
			
			// increment purchase list if already exits otherwise default to 1.
			for (Iterator<String> fpItr = friendPurchases.iterator(); fpItr
					.hasNext();) {
				String friendPurchase = (String) fpItr.next();
				if (myPurchasesMap.get(friendPurchase) == null) {
					if (purchaseMap.get(friendPurchase) != null) {
						int numOfPurchases = purchaseMap.get(friendPurchase);
						numOfPurchases++;
						purchaseMap.put(friendPurchase, numOfPurchases);
					} else {
						purchaseMap.put(friendPurchase, 1);
					}
				}
			}
		}
		
		
		// Sorted map by purchases.
		Map rankMap = new TreeMap(new PurchseComparator(purchaseMap));
		rankMap.putAll(purchaseMap);
		
		return new ArrayList<String>(rankMap.keySet());
	}

	/**
	 * this is a library function written to make code compile..
	 * 
	 * @param user
	 * @return
	 */
	private List<String> getFriendsListForUser(String user) {
		return AmaTest.getFriendsListForUser();
	}

	private List<String> getPurchasesForUser(String user) {
		return AmaTest.getProductList(user);
	}

	
	
}




class PurchseComparator implements Comparator {
	 
	Map map;
 
	public PurchseComparator(Map map) {
		this.map = map;
	}
 
	public int compare(Object keyA, Object keyB) {
		int valA =(Integer) map.get(keyA);
		int valB =(Integer)map.get(keyB);
		if (valA >= valB) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
		
	}
}
	

