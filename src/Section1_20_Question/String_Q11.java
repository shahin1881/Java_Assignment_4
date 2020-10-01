package Section1_20_Question;


import java.text.*;
import java.util.*;

public class String_Q11 {

	
	/*Question: String i/p1=2012;
                    sTRING i/p2=5
                    IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;

		*/

	   public static void main(String[] args) throws ParseException {
		
	       String p1="2017"; 
	       String p2="5";
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		  Date d1=sdf.parse(p1);//2012
		  System.out.println(d1);//2012
		  Date d2=new Date();//2020
		  System.out.println(d2);//2020
		 
		 int n1=d1.getYear();//2012
         int n2=d2.getYear();//2020
		 int n3=Integer.parseInt(p2);//5
		 if((n2-n1)>n3)//2020-2012...8>5//3>5
		 
		     System.out.println("True");
		 else
			 System.out.println("False");
				}
		
		}
	