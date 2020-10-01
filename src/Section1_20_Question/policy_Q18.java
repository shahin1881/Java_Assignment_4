package Section1_20_Question;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class policy_Q18 {
	public static void main(String[] args) {
/*		
		Question: i/p: Honesty is my best policy
                  o/p: Honesty
                       Return the maximum word length from the given string.
                       If there are two words of same length then,
                      return the word which comes first based on alphabetical order.
*/
		
		
		
		String s = "Aonesty is my best policy";
		
		String s1[]=s.split(" ");
		int length=0;
		
		for(int i=0;i<s1.length;i++)//0,1,2,3,4
		{
			String s2=s1[i];//Honesty..is..
			if(length<s2.length())
			{
				length=s2.length();//7
			}
		}
		System.out.println(length);//Honesty
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			String s4 = s1[i];//Honesty..is..my..best..policy
			if(length==s4.length())
			{
				ts.add(s4);
			}
		}
		for(String s5:ts)//Honesty
		{
			System.out.println(s5);
			break;
		}
	}

}


