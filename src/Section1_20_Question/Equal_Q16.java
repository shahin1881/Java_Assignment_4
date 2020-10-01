package Section1_20_Question;

import java.util.Scanner;

public class Equal_Q16 {

	public static void main(String[] args) {

		/*
	Question: Return 1 if the last & first characters of a string are equal else 
              return -1. Consider case.
               Eg:Input = "this was great"
                 Output= 1
		 */
		
		Scanner se = new Scanner(System.in);
		System.out.println("Enter String:= ");
		String s = se.nextLine();
		
		
         //String s = "thit was great";
		
		
		   // if(s.startsWith("t")==s.endsWith("t")){
         if(s.toUpperCase().startsWith("T")== s.toLowerCase().endsWith("t"))
         {
        	  System.out.println("1");
          }else{
        	  System.out.println("-1");
          }

          
		

		    
		    
		    /* if (s.charAt(0) == s.charAt(s.length() - 1)) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}

	*/
}
}