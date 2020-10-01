package Section1_20_Question;

import java.util.Scanner;

public class prefix_Q4 {
	public static void main(String[] args) {
		
/*		Question: String array will be given.if a string is Prefix of an any other
	              string in that array means count.
	            
         prefix  means Start with group of letter.
		 eg.abc is a prefix for"abcpq" */
	
		
		
		
	   String str ="Sham Raj Kapil Sima Dev Priyanka";
	   String check ="R";
	   String[] arr = str.split(" ");//6
	   
	   int count = 0;
	    for(int i=0;i<arr.length;i++)//0,1,2,3,4
	    {
	    	if(!arr[i].contains(check))//if condition does not match then incrmt count.
	    	{
	    		count++;//1,2,3,4(1+1+1+1=4)
	    	}
	    }
	    
	    if(count >= 1)//4>=1
      System.out.println(count);//4
	    else
	    	System.out.println("Given String not present in String");
	    
	}
}
	     








		  /*public static int PreFixes(String[] p) {
		  int n=0;
		  for(int i=0;i<p.length;i++)//0,...1
		  for(int j=i+1;j<p.length;j++){//1,2,3,4//1,2,3
		  String s1=p[i];//pinky//preethi
		  String s2=p[j];//preethi,puppy,preeth,puppypreethi//puppy
		  if(s2.startsWith(s1)||s1.startsWith(s2))
		   n++; 
		  }
		  return n;
		   
		}
		
		    public static void main(String[] args) {
			 String[] p={"pinky","preethi","sp","preeth","puppypreethi"};//1,3
			 System.out.println(PreFixes(p));
			}
		}*/
