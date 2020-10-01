package Section1_20_Question;

import java.util.Scanner;

public class vowel_Q19 {
	public static void main(String[] args) {

		/*Question: In a string check whether all the vowels are present
                    if yes return 1 else 2.
                    ex: String 1="education"
                    output=1.   
                    
                    //vowles: a,e,i,o,u
		*/
		
		Scanner se =new Scanner (System.in);
		System.out.println("enter the string");
		String s= se.next();//education
		
		//String s ="education";
		
		//String s = "AeiUUamlp";

		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < s.length(); j++) {//0,1,2,3,4,5,6,7,8
			char c = s.charAt(j);//e
           if ((c == 'a') || (c == 'A')) {//e..d..u..c..a..t..i..o
				a++;//1
			} else if ((c == 'e') || (c == 'E')) {
				e++;//1
			} else if ((c == 'i') || (c == 'I')) {
				i++;//1
			} else if ((c == 'o') || (c == 'O')) {
				o++;//1
			} else if ((c == 'u') || (c == 'U')) {
				u++;//1
			}
		}

		if ((a != 0) && (e != 0) && (i != 0) && (o != 0) && (u != 0)) {//condition true
			System.out.println("1");
		} else {
			System.out.println("2");
		}

	}

}
