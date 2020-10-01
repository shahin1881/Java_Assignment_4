package Section1_20_Question;

import java.util.Scanner;

public class replace_Q3 {
	public static void main(String[] args) {

/*		Question: Input1=”Hello World”;  
		          output---à  “dello WorlH”.*/

		Scanner se = new Scanner(System.in);
		System.out.println("Enter String");
		String s = se.nextLine();

		// String s = "Hello World";
		
		char c1 = s.charAt(0);//H
		char c2 = s.charAt(s.length() - 1);//d

		String n[] = s.split(" ");
		String n1 = n[0];//Hello
		String n2 = n1.replace(n1.charAt(0), c2);//dello

		String n3 = n[1];//World
		String n4 = " " + n3.replace(n3.charAt(n3.length() - 1), c1);//WorlH

		System.out.println(n2.concat(n4));//dello WorlH

	}

}
