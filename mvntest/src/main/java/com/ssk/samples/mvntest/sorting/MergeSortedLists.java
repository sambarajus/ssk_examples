package com.ssk.samples.mvntest.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author sskumar
 *
 */
public class MergeSortedLists {

	public List<Integer> merge(List<Integer> a, List<Integer> b) {

		List<Integer> sortedList = new ArrayList<Integer>();
		int i = 0, j = 0, k = 0;

		while (i < a.size() && j < b.size()) {
			if (a.get(i).intValue() < b.get(j).intValue())
				sortedList.add(a.get(i++));
			else
				sortedList.add(b.get(j++));
		}

		while (i < a.size())
			sortedList.add(a.get(i++));

		while (j < b.size())
			sortedList.add(b.get(j++));

		return sortedList;
	}
	
	public static void main(String args[]){
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(15);
		l2.add(25);
		l2.add(35);
		l2.add(45);
		l2.add(55);
		l2.add(65);
		
		MergeSortedLists merge = new MergeSortedLists();
		List<Integer> l = merge.merge(l1, l2);
		
		for (Iterator<Integer> iterator = l.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer.intValue()+" ");
		}
	}
}
