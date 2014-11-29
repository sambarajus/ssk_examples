/**
 * 
 */
package com.ssk.samples.mvntest.ds.tree.bst;

/**
 * @author sskumar
 *
 */
public class BinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(30);
		Node n1 = new Node(20);
		Node n2 = new Node(20);
		root.left = n1;
		root.right = n2;
		Node n3 = new Node(20);
		Node n4 = new Node(20);
		n1.left = n3;
		n1.right = n4;
		
		Node n5 = new Node(20);
		Node n6 = new Node(20);
		n2.left = n5;
		n2.right = n6;
		Node n7 = new Node(20);
		Node n8 = new Node(20);
		n3.left = n7;
		n3.right = n8;
		Node n9 = new Node(20);
		Node n10 = new Node(20);
		n4.left = n9;
		n4.right = n10;
		Node n11 = new Node(20);
		Node n12 = new Node(20);
		n5.left = n11;
		n5.right = n12;
		Node n13 = new Node(20);
		Node n14 = new Node(20);
		n6.left = n13;
		n6.right = n14;
		/*Node n15 = new Node(20);
		Node n16 = new Node(20);
		n6.left = n9;
		n6.right = n10;*/

//		System.out.println(isBalanced(root, 0, 0));
		int height = 0;
		System.out.println(isBal(root, height));
		System.out.println(height);

	}

	public static boolean isBalanced(Node n, int leftHeight,int rightHeight){
		
		if(n==null){
			return true;
		}
		
		int left = getHeight(n.left);
		int right = getHeight(n.right);
		System.out.println(" Left Height : "+left);
		System.out.println(" Right Height : "+right);
		if(left-right>1 || right-left>1)
			return false;
		
		return true;
	}
	
	private static int getHeight(Node n){
		if(n==null)
			return 0;
		int left = getHeight(n.left);
		int right = getHeight(n.right);
		return left+right+1;
	}
	
	
//Incomplete solution.....	
	private static boolean isBal(Node n, int height){
		
		int left = 0;
		int right = 0;
		
		if(n==null){
			height = 0;
			return true;
		}
			
		isBal(n.left,left);
		isBal(n.right,right);

		height = left+right+1;
		
		if(left-right<=1 || right-left<=1)
			return true;
		return false;
	}
	
}
