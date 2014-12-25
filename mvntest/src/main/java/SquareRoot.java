/**
 * 
 */

/**
 * @author shravans
 *
 */
public class SquareRoot {

	
	public static float findSqrt(int n){
		float sqrt = n/2;
		float g = n;
		int c = 0;
		while(g-sqrt!=0){
			g = sqrt;
			c++;
			System.out.println("C : "+c+", g: "+g);
			sqrt = (g+(n/g))/2;
		}
		return sqrt;
	}
	public static void main(String args[]){
		System.out.println(findSqrt(184));
	}
}
