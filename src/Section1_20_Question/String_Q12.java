package Section1_20_Question;

import java.util.Scanner;

public class String_Q12 {
	public static void main(String[] args) {
		/*
		 Question: input string="hello", //n=2
                   output: lolo
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter String:=");
		String s = se.next();

		// String s = "hello";

		String n = "";
		n = n + s.charAt(s.length() - 2) + s.charAt(s.length() - 1);//lo
		int no = 2;//2
		for (int i = 1; i < no; i++) {
			n = n + n;//lo+lo = lolo
		}
		System.out.println(n);//lolo

	}

}
