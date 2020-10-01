package Section1_20_Question;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Deleatrepited_Q1 {

	public static void main(String[] args) {

		/*Question:  INPUT1= helloworld 
	                 INPUT2= 2. delete the char,if rpted twice.
		             if occurs more than twice,leave the first occurence and delete the duplicate 
		             O/P= helwrd;
		 */
		
		
		Scanner se = new Scanner(System.in);
		System.out.println("Enter String");
		String s = se.next();

		
		//String s = "helloworld";
		String s1 = "";
		int count = 0;

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();//it is used for  remove  dublicate char .

		for (int i = 0; i < s.length(); i++) {//0..h,1..e,2..l
			for (int j = 0; j < s.length(); j++)
			{
				if (s.charAt(i) == s.charAt(j)) {
					count++;//1
				
				}
			}
			
			if (count == 2) {//1,1,,1,3....2
				count = 0;
			} else {
				hs.add(s.charAt(i));//helwrd
				count = 0;//0
			}
		}

		for (char c : hs) {//for each loop it is used to print
			s1 = s1 + c;//h,e,l,w,r,d...helwrd
		}
		System.out.println(s1);
	}

}
