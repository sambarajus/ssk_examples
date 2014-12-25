import java.util.Scanner;

/**
 * 
 */

/**
 * @author shravans
 *
 */
public class DigitCount {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
			int number = Integer.parseInt(sc.nextLine());
			int temp = number;
			int count = 0;
			while (true) {
				int digit = temp % 10;
				temp = temp / 10;
				if (digit != 0) {
					if (number % digit == 0 && number/digit!=1) {
						count++;
					}
				}else if(temp ==0){
					break;
				}
			}
			if(count!=0)
                System.out.println(count);
			
		}
	}

}
