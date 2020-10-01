package Section1_20_Question;

import java.util.Scanner;

public class Hashmap_Q8 {

	public static void main(String[] args) {

		/*
  Question: input---input1=1;
            input2=4;
            input3=1;
            output1=4;
            
            operation--- print the element which is not repeated    
            if all the inputs r different sum all inputs
            input---input1=1;
            input2=2;
            input3=3;
            output1=6;

		 */
		
		Scanner se = new Scanner(System.in);
		System.out.println("Enter 1st value= ");
		int n1 = se.nextInt();
		System.out.println("Enter 2nd value= ");
		int n2 = se.nextInt();
		System.out.println("Enter 3rd value= ");
		int n3 = se.nextInt();
		int ans = 0;
		
		// int n1=1,n2=1,n3=3,ans=0;
		
		if (n1 == n2) {//1,4
			ans = n3;
		} else if (n1 == n3) {//1,1
			ans = n2;//4
		} else if (n2 == n3) {
			ans = n1;
		} else {
			ans = n1 + n2 + n3;//1+2+3=6
		}
		System.out.println(ans);//final output

	}
}
