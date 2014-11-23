package com.ssk.amazon.challenge;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StuffYourFriendsTest {

	@Test
	public void testRank(){
		 Map<String, List<String>> clientMap = new HashMap<String, List<String>> ();
	     List <String> clientList = new ArrayList<String>();
       clientList.add("c1");
       clientList.add("c2");
       clientList.add("c3");
       clientList.add("m1");
       List <String> mProducts = new ArrayList<String>();
       mProducts.add("p4");
       clientMap.put(clientList.get(3), mProducts);
       List <String> c1Products = new ArrayList<String>();
       c1Products.add("p1");
       c1Products.add("p2");
       c1Products.add("p3");
       clientMap.put(clientList.get(0), c1Products);
       List <String> c2Products = new ArrayList<String>();
       c2Products.add("p1");
       c2Products.add("p2");
       clientMap.put(clientList.get(1), c2Products);
       List <String> c3Products = new ArrayList<String>();
       c3Products.add("p3");
       c3Products.add("p1");
       c3Products.add("p2");
       clientMap.put(clientList.get(2), c3Products);

       StuffYourFriends test = new StuffYourFriends();
       List<String> ranks = test.getRank("m1");
       for (Iterator iterator = ranks.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
		
	}
       
       assertEquals(3, ranks.size());
       
       assertEquals("p1", ranks.get(0));
       
	}
	
}
