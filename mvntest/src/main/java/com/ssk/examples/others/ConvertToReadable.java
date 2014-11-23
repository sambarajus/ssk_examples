package com.ssk.examples.others;

/**
 * 
 * @author sskumar
 * 
 *         Input is a string of Bytes E.g.341B Convert it to human readable
 *         form: 3 characters long (excluding decimal) No trailing or leading
 *         zeros E.g: Input 341B Output 341B Input 12345B Output 12.3K Input
 *         1234567B Output 1.23M Input 1000000000B Output 1G
 * 
 *         Do not round off Assume input will not be more than 1G For this
 *         problem 1000B = 1K, so on and so forth
 * 
 */
public class ConvertToReadable {

	private static int B = 1;
	private static int K = 1000 * B;
	private static int M = 1000 * K;
	private static int G = 1000 * M;

	public String convert(String s) {

		char m = s.charAt(s.length() - 1);

		s = s.substring(0, s.length() - 1);
		Integer val = null;
		switch (m) {
		case 'B':
			val = new Integer(s);
			val = val * B;
			break;
		case 'K':
			val = new Integer(s);
			val = val * K;
			break;
		case 'M':
			val = new Integer(s);
			val = val * M;
			break;
		case 'G':
			val = new Integer(s);
			val = val * B;
			break;
		default:
			break;
		}
		if(val/Math.pow(10, 9)>=1)
		{
			System.out.println(val/Math.pow(10, 9)+"G");
		}
		else if(val/Math.pow(10, 6)>=1)
		{
			System.out.println(val/Math.pow(10, 6)+"M");
		}
		else if(val/Math.pow(10, 3)>=1)
		{
			System.out.println(val/Math.pow(10, 3)+"K");
		}
		else
		{
			System.out.println(val+"B");
		}
		
		
		return val.toString();
	}

	public static void main(String args[]) {
		ConvertToReadable test = new ConvertToReadable();
		test.convert("");
	}
}
