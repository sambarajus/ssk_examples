package com.ssk.examples.strings;

public class StringReverse {

	public static String reverseString(char[] str) {
		System.out.println("Before reverse : " + str);
		int start = 0;
		int end = str.length - 1;
		while (start < end) {
			char temp = str[end];
			str[end] = str[start];
			str[start] = temp;
			start++;
			end--;
		}
		System.out.println("After reverse : " + new String(str));
		return new String(str);
	}

	public static String revWordsInString(char[] a) {

		// reverse whole
		// reverseWord(a, 0, a.length);

		int st = -1;
		int end = -1;

		for (int i = 0; i < a.length; i++) {
			if (st == -1 && a[i] != ' ') {
				st = i;
			}
			if (end == -1 && a[i] == ' ') {
				end = i;
			}
			if (i == a.length - 1) {
				end = i + 1;
			}
			if (st != -1 && end != -1) {
				reverseWord(a, st, end); // reverse a word....
				st = -1;
				end = -1;
			}
		}

		return new String(a);
	}

	public static String reverseWord(char[] str, int start, int end) {
		System.out.println("Before reverse : " + str);
		end--;
		while (start < end) {
			char temp = str[end];
			str[end] = str[start];
			str[start] = temp;
			start++;
			end--;
		}
		System.out.println("After reverse : " + new String(str));
		return new String(str);
	}

	public static String reverseWords(String s) {
		char[] stringChar = s.toCharArray();
		int length = stringChar.length, tempIndex = 0;

		Swap(stringChar, 0, length - 1);

		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				Swap(stringChar, tempIndex, i);
				tempIndex = i + 1;
			} else if (stringChar[i] == ' ') {
				Swap(stringChar, tempIndex, i - 1);
				tempIndex = i + 1;
			}
		}
		System.out.println(new String(stringChar).toString());
		return new String(stringChar);
	}

	private static void Swap(char[] p, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			/*
			 * p[startIndex] ^= p[endIndex]; p[endIndex] ^= p[startIndex];
			 * p[startIndex] ^= p[endIndex]; startIndex++; endIndex--;
			 */

			char ch = p[endIndex];
			p[endIndex] = p[startIndex];
			p[startIndex] = ch;
			startIndex++;
			endIndex--;
		}
	}

}
