package Section1_20_Question;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Q9 {
	//public static void main(String[] args) {
		/*
		 Question: input1-- Hello*world
                   output-- boolean(true or false)
                  operation-- if the character before and after * are same return true else false
                 if there in no star in the string return false(Ignore case)

		 */
		
		/*  Scanner se = new Scanner(System.in);
		  System.out.println("Enter String with ' * ':= ");
		  String s = se.nextLine();
		 

	//	String s = "Hello*Hello";

		char c = '*';
		int a = 0;
		int count = 0;

		String s1 = "";
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {//0,1,2,3,4

			char c1 = s.charAt(i);//H..e..l..l..0
			if (c == c1) {//* == hello  //world
				a = i;//5..hello
			}

			s1 = s.substring(0, a);//""..Hello

			s2 = s.substring((a + 1), s.length() );//ello..*world //world

		}
		//if (s1.equals(s2)) {//Hello*world
		if(s.endsWith("o")==s.startsWith("o")){
			System.out.println("True");
		}

		else {
			System.out.println("False");
		}

	}

}*/           
	
	
	
		 public static boolean charCheck(String s) {
		 boolean b=false;
		 StringTokenizer t=new StringTokenizer(s,"*");
		 String s1=t.nextToken();//Hello
		 String s2=t.nextToken();//world
		 String s3=s1.substring(s1.length()-1);//o
		 String s4=s2.substring(0,1);//w
		 if(s3.equalsIgnoreCase(s4))//o...w
		     b=true;
		     return b;//false
		  }
		
		 
		public static void main(String[] args) {
		String s="Hello*oorld";
		System.out.println(charCheck(s));//Hello world
			
		      }  
		   }
