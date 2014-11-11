package com.ssk.examples.cch1;
/**
 * 
 * @author shravans
 *Question 1.6 in Cracking Coding Interview
 */
public class RotateMatrix {
//O(n2)
	public int[][] rotate(int[][] matrix, int n){
		for (int layer = 0; layer<n/2;++layer){
			int first = layer;
			int last = n-1-layer;
			for(int i=first; i<last;++i){
				int offset = i=first;
				int top = matrix[first][i];
				
				//move left to top
				matrix[first][i]=matrix[last-offset][first];
				//move bottom to left
				matrix[last-offset][first]=matrix[last][last-offset];
				//move right to bottom
				matrix[last][last-offset]=matrix[i][last];
				//move top to right
				matrix[i][last]=top;
			}
		}
		
		return matrix;
	}
}
