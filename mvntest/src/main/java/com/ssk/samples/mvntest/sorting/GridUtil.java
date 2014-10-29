package com.ssk.samples.mvntest.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class GridUtil {

	private  Map<String, Integer> colIndexMap = new HashMap<String, Integer>();
	public static void main(String args[]) {
		Row r1 = new Row("A","A");
		Row r2 = new Row("A","B");
		Row r3 = new Row("B","C");
		Row r4 = new Row("B","B");
		Row r5 = new Row("C","A");
		Row r6 = new Row("C","B");
		Row r7 = new Row("C","D");
		Row r8 = new Row("A","D");
		Row r9 = new Row("B","D");
		Row r10 = new Row("D","B");
		Row r11 = new Row("D","C");
		Row r12 = new Row("D","E");
		List<Row> rowList = new ArrayList<Row>();
		rowList.add(r1);
		rowList.add(r2);
		rowList.add(r3);
		rowList.add(r4);
		rowList.add(r5);
		rowList.add(r6);
		rowList.add(r7);
		rowList.add(r8);
		rowList.add(r9);
		rowList.add(r10);
		rowList.add(r11);
		rowList.add(r12);
		
		GridUtil util = new GridUtil();
		util.getRuleMatrix(rowList);
	}

	public boolean[][] getRuleMatrix(List<Row> rowList){
		
		SortedSet<String> colSet = new TreeSet<String>();
		SortedSet<String> rowSet = new TreeSet<String>();
		Collections.sort(rowList);
		Iterator<Row> itr = rowList.iterator();
		HashMap<String, List<Row>> rowMap = new HashMap<String, List<Row>>();
		while (itr.hasNext()) {
			Row row = (Row) itr.next();
			rowSet.add(row.getRowKey());
			colSet.add(row.getValue());
			if(rowMap.get(row.getRowKey())!=null){
				rowMap.get(row.getRowKey()).add(row);
			}else{
				List<Row> l = new ArrayList<Row>();
				l.add(row);
				rowMap.put(row.getRowKey(), l);
			}
		}
		
		Iterator it = colSet.iterator();
		
		while (it.hasNext()) {
			String object = (String) it.next();
			System.out.println(object);
			
		}
		
		
		boolean[][] arr = new boolean[rowSet.size()][colSet.size()];
		
		int rowIndex = 0;
		for (Iterator iterator = rowSet.iterator(); iterator.hasNext();) {
			String rowKey = (String) iterator.next();
			List<Row> rows = rowMap.get(rowKey);
			for (Iterator iterator2 = rows.iterator(); iterator2.hasNext();) {
				Row row = (Row) iterator2.next();
				arr[rowIndex][this.getIndex(colSet,row.getValue())] = true;
			}
			rowIndex++;
		}
		return arr;
	}
	
	private int getIndex(Set<? extends Object> set, Object value) {
		   int result = 0;
		   for (Object entry:set) {
		     if (entry.equals(value)){
		    	colIndexMap.put((String)value,result);
		    	 return result;
		     }
		     result++;
		   }
		   return -1;
		 }
	
}

class Row implements Comparable<Row>{
	String rowKey;
	String value;

	Row(String r, String val) {
		this.rowKey = r;
		this.value = val;
	}

	
	/**
	 * @return the rowKey
	 */
	public String getRowKey() {
		return rowKey;
	}


	/**
	 * @param rowKey the rowKey to set
	 */
	public void setRowKey(String rowKey) {
		this.rowKey = rowKey;
	}


	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}


	public int compareTo(Row o) {
		// TODO Auto-generated method stub
		
		return this.rowKey.compareTo(o.getRowKey());
	}
}
