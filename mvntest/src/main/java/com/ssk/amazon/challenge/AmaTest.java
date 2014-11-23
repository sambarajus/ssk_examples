package com.ssk.amazon.challenge;
import java.util.*;

public class AmaTest {
    static Map<String, List<String>> clientMap = new HashMap<String, List<String>> ();
    static List <String> clientList = new ArrayList<String>();
    static{
        populateProduct();
    }
    
    static void populateProduct()
    {

        clientList.add("c1");
        clientList.add("c2");
        clientList.add("c3");
        clientList.add("m1");
        List<String> clientList = getFriendsListForUser();
        
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
    }

    public static List <String>getFriendsListForUser()
    {
        return clientList;
    }
    
    public static List <String> getProductList(String clientId)
    {
        return clientMap.get(clientId);
    }
    public static void main(String args[])
    {
        //populateProduct();
        print();
        
    }
    public static void print()
    {
        List<String> clList = getFriendsListForUser();
        for(String client : clList)
        {
            List<String> prod = getProductList(client);
            for(String p : prod)
            {
                System.out.print(p + " ");
            }
            System.out.println("    " +  client);
        }
    }
}