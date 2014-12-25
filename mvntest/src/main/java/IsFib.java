import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * 
 */

/**
 * @author shravans
 *
 */
public class IsFib {

	public static void main(String[] args) {

		System.out.println(isFib("6"));
		
		/*Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<t;i++){
			isFib(sc.nextLine());
			
		}*/
	}

	public static boolean isFib(String num){
		BigInteger number = new BigInteger(num);
		BigInteger fiveMultiply = (number.pow(2)).multiply(new BigInteger("5"));
		if((isPerfectSquare(fiveMultiply.add(new BigInteger("4"))))
			||	isPerfectSquare(fiveMultiply.subtract(new BigInteger("4")))){
			 System.out.println("IsFibo");
			 return true;
        }else{
            System.out.println("IsNotFibo");
            return false;
        }
	}

	public static boolean isPerfectSquare(BigInteger n) {
		BigDecimal in = new BigDecimal(n); 
		BigDecimal sqrt =new BigDecimal( n.divide(new BigInteger("2")));
		BigDecimal g = new BigDecimal(n);
		int c = 0;
		
		while(g.subtract(sqrt).doubleValue()>0.0001){
			System.out.println("Sqrt : "+sqrt.doubleValue());
			g = sqrt;
			c++;
//			System.out.println("C : "+c+", g: "+g.doubleValue());
			sqrt = (g.add((in.divide(g,4,RoundingMode.HALF_UP))).divide(new BigDecimal("2"),4,RoundingMode.HALF_UP));
			System.out.println("FFF: "+g.subtract(sqrt));
		}
		return sqrt.pow(2).compareTo(in)==0;
	}
}
