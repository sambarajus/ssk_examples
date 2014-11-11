package com.ssk.examples.searching;

public class BinarySearch
{
   public static void main (String [] args)
   {
	   int [] x = { -5, 12, 25, 20, 30, 72, 456 };
	   BinarySearch search = new BinarySearch();
	   System.out.println(search.binarySearch(x, 30));
     
   }
   
   
   public int binarySearch(int[] sorted, int key) {

	    int low = 0;
	    int high = sorted.length -1;
	    int middle = 0;
	    boolean found = false;
		while (low <= high) {
			middle = (low + high) / 2;

			if (key > sorted[middle]) {
				low = middle + 1;
				found = false;
			} else if (key < sorted[middle]) {
				high = middle - 1;
				found = false;
			} else {
				found = true;
				break;
			}

		}

		if (found) {
			return middle;
		} else {
			return -1;
		}

	}
   
   public void find(int[] x, int key)
   {
	   
	      int loIndex = 0;
	      int hiIndex = x.length - 1;
	      int midIndex, srch = 25;
	      while (loIndex <= hiIndex)
	      {
	         midIndex = (loIndex + hiIndex) / 2;
	         if (srch > x [midIndex])
	             loIndex = midIndex + 1;
	         else
	         if (srch < x [midIndex])
	             hiIndex = midIndex - 1;
	         else
	             break;
	      }
	      if (loIndex > hiIndex)
	          System.out.println (srch + " not found");
	      else
	          System.out.println (srch + " found");
   }
}