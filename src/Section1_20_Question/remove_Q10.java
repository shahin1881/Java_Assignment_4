package Section1_20_Question;

import java.util.Scanner;

public class remove_Q10 {
	
	public static void main(String[] args) {
		/*
		Question: input --String input1 ="xaXafxsd"
                  output--String output1="aXafsdxx"
                  operation-- remove the character "x"(only lower case) 
                  from string and place at the end

		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter String");
		String s = se.next();

		// String s = "xaXafxsd";

		String n = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'x') {
				count++;
			} else {
				n = n + s.charAt(i);//a.X.a.a.s.d
			}
		}

		for (int i = 0; i < count; i++) {
			n = n + 'x';//aXaasa+xx...aXafsdxx
		}
		System.out.println(n);

	}

}
