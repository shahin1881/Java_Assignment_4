package Section1_20_Question;

import java.util.Scanner;

public class sequence_Q6 {
	public static void main(String[] args) {
		/*
		 Question:  int[] input={2,1,4,1,2,3,6};
                    check whether the input has the sequence of "1,2,3". if so-
                    output=true;
                    
                    int[] input={1,2,1,3,4,5,8};
                    output=false

		 */

		/*int[] no = new int[7];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < no.length; i++) {

			no[i] = sc.nextInt();

		}
		*/
		
		int no[]={1,2,1,3,4,5,8};
		String n = "123";
		String nj = "";
		for (int i = 0; i < no.length; i++) {
			nj = nj + no[i];//2,1,4,1,2,3,6
		}
		if (nj.contains(n)) {//2,1,4,1,2,3,6......123..it is match of the sequence of string 
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
