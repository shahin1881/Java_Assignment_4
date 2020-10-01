package Section1_20_Question;

import java.util.Scanner;

public class ISBnumber_Q13 {
	public static void main(String[] args) {

		/* Question: prove whether a number is ISBN number or not
                     input="0201103311"
                     ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 +0*5+ 3*4 +3*3+ 1*2 +1*1
                     sum%11==0 then it is ISBN number
                     
                     
                     //55%11==0
                    // ISBN is an International Standard Book Number
		*/
		
		/*Scanner se = new Scanner (System.in);
		System.out.println("Enter String:=");
		String s= se.next();
		
		
		
		
		//String s = "0201103311";

		int no = Integer.parseInt(s);

		int n = 1, ans = 0;
		while (no != 0) {
			int x = no % 10;//10%10=1,1
			ans = ans + (x * n);//0+(1*1)..1
			n++;//1
			no = no / 10;
		}
		if (ans % 11 == 0) {
			System.out.println("ISBN Number");
		} else {
			System.out.println("Not ISBN Number");
		}
	}

} 


*/     
		
		
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Give isbn :");
		String isbn=scan1.next();
		if(isbn.length() !=10)//0201103311
		{
			System.out.println("invalid isbn: length should be 10");
			System.exit(0);
			}
		   int sum= 0;//o
		 for(int i= 0;i<= 8;i++){//0,1,2,3,4
			char c=isbn.charAt(i);//0,2,0,1,1
		if((c>='0') && (c<='9'))//condition true
		{
			sum+= (c-'0')* (10 -i);//0*10=0,2*9=18,0*8=0,1*7=7,1*6
		}
		else{System.out.printf("invalid isbn: wrong digit at position %d",i);
		System.exit(0);
		}
		}char c=isbn.charAt(9);
		if(c=='X')
		{
			sum+= 10;
		}else if((c>='0') && (c<='9'))
		{
			sum+= (c-'0');}else{System.out.println("invalid isbn: wrong last character");
			System.exit(0);
			}if(sum% 11 == 0)
				System.out.println("valid isbn");
			else
				System.out.println("invalid isbn: wrong sum: "+sum);
			}
		}
