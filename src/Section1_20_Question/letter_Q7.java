package Section1_20_Question;

import java.util.Scanner;

public class letter_Q7 {
	//public static void main(String[] args) {
/*		 
		    Question: Input1=”cowboy”; 
		              Output1=”cowcow”;
		              
                      Input1=”so”;
                      output1=”sososo”; 
                      HINT: if they give 3 letter word u have to display 2 time;

*/
	
	   /* public static String charCount(String p1,String p2) {
	    StringBuffer sb=new StringBuffer();
	    int n1=p2.length();
		if(n1==3)
		for(int i=0;i<n1-1;i++)
		sb.append(p1.substring(0, n1));
		 else if(n1==2)
		for(int i=0;i<n1+1;i++)
		sb.append(p1.substring(0, n1));
		return sb.toString();
			}
			
	
		public static void main(String[] args) {
		String p1="cowyob";
	    String p2="cow";
		System.out.println(charCount(p1,p2));
				}
			}
*/





            public static void main(String[] args) {
           /* Scanner se =new Scanner (System.in);
            System.out.println("Enter String which has repeted 3 time:=");
            String s= se.next();*/

            String s = "so";	
 	
              int count=0; 		
              String s1="";

              if(s.length()==2)
    {
	         for(int i=1;i<=3;i++)
	{
		       s1=s1+s;
	}
               }System.out.println(s1);
          }

            }