/**
 * 
 */

/**
 * @author shravans
 *
 */
public class NonZeroMinIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,3,0};
		System.out.println(minIndex(a));

	}

	
	public static int minIndex(int a[]){
		int minIndex = -1;
		
		for(int i = 0;i<a.length;i++){
			if(a[i]!=0){
				if (minIndex == -1){
					minIndex = i;
				}else if(a[i]<a[minIndex]){
					minIndex = i;
				}
				
			}
		}
		
		return minIndex;
		
	}
}
