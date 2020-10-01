package Section1_20_Question;

import java.util.Scanner;

public class duplicate_Q2 {
	//public static void main(String[] args) {
		
/*		Question: input="hello"..h
                  output="hlo"; Alternative positions...
*/
		/*Scanner se= new Scanner (System.in);
		System.out.println("Enter String");
		String s= se.next();*/
		
		/*String n = "";

       for (int i = 0; i < s.length(); i++) {
        if ((2 * i) < s.length()) {//2*0,2*1,2*2,2*3,2*4.
        n = n + s.charAt(2 * i);//hlo
   }
    }
    System.out.println("Alternative positions String is: " + n);
  }
     */
		
		//String s = "hello";
		
		
				/*String n ="";
				for(int i=0;i<s.length();i=i+2)
				{
					n = n + s.charAt(i);
				}System.out.println(n);
	
	}

}*/



     public static String alternativeChar(String s){
     StringBuffer sb=new StringBuffer();
     for(int i=0;i<s.length();i++)
       if(i%2==0)//
       sb.append(s.charAt(i));
       return sb.toString();
  }

    public static void main(String[] args) {
    String s="hello"; 
    System.out.println(alternativeChar(s));
}
}