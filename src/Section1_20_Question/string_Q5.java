package Section1_20_Question;

import java.util.Scanner;

public class string_Q5 {
	public static void main(String[] args) {
		/*
		  Question: count the number of words in the string
                    Input string="i work in cognizant.";
                    output=4;
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("enter String");
		String s = se.nextLine();

		 //String s = "i work in cognizant";
		 
		 String n[] = s.split(" ");
		 System.out.println(n.length);

	}

}
