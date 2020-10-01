package Section1_20_Question;

import java.util.Scanner;

public class concat_20 {

	public static void main(String[] args) {
		/*
		Question: swap the every 2 chrecters in the given string 
                  If size is odd number then keep the last letter as it is.
                  Ex:- input: forget
	              output: ofgrte
	              
              Ex:- input  : NewYork
                 output : eNYwrok
		*/
	/*Scanner se = new Scanner (System.in);
	System.out.println("enter String:=   ");
	String s= se.next();*/
		

		String s = "forget";

		String nj = "";
		if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length(); i = i + 2) {
				char c1 = s.charAt(i);
			
				char c2 = s.charAt(i + 1);
			
				nj = nj + c2 + c1;
			
			}
		} else {
			char x = s.charAt(s.length() - 1);
			for (int i = 0; i < s.length() - 1; i = i + 2) {
				char c1 = s.charAt(i);
				char c2 = s.charAt(i + 1);
				nj = nj + c2 + c1;
			}
			nj = nj + x;
		}
		System.out.println(nj);

	}
}     
	
	/*public static String GivenString(String s1)
	{
		StringBuffer sb=new StringBuffer();
		int j=0;
		if(s1.length()%2==0){//NewYork
			j=s1.length();
		}else{
		    j = s1.length()-1;//6 value store
		}
		for(int i=0;i<j;i=i+2){//0,1
		String s2=(s1.substring(i, i+2));//Ne,wY,or
		StringBuffer sb1=new StringBuffer(s2);
		sb.append(sb1.reverse());
		}
		String s3=new String();
		if(s1.length()%2==0){
			s3=sb.toString();
		}else{
		 s3 = sb.append(s1.charAt(s1.length()-1)).toString();
		}return s3;
	}
	
	
	public static void main(String[] args)
	{
		String s1="NewYork";
		System.out.println(GivenString(s1));
		}
	}*/

