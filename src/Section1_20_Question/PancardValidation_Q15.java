package Section1_20_Question;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PancardValidation_Q15 {
	public static void main(String[] args) {
		
		
/*		Question: pan card number validation:
                  all letters shud be in caps,shud be of 8 chars.
                  first three letters must be alphabets.
                  next 4 letters shud be digits and last letter shud be an alphabet
AAAPL1234C
*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PAN number in ABCDE1234F  format");

		String input = sc.nextLine();

		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");

		Matcher matcher = pattern.matcher(input);
		// Check if pattern matches
		if (matcher.matches()) {

			System.out.println("It is a valid PAN number");
		} else {
			System.out.println("It is not valid PAN number");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*public static void main(String[] args) {
              Scanner s=new Scanner(System.in);
              String pan=s.next();
              boolean b=panNumberValidation(pan);
              if(b==true)
              System.out.println("valid Pancard Number");
          else
              System.out.println("not a valid credential");
          }
            public static boolean panNumberValidation(String pan) {
            boolean b=false,b1=false,b2=false;
            String s1=pan.substring(0, 3);
            String s2=pan.substring(3, 7);
             if(pan.length()==8)
           if(Character.isAlphabetic(pan.charAt(pan.length()-1)) && Character.isUpperCase(pan.charAt(pan.length()-1)))
            b1=true;
           if(b1==true)
           for(int i=0;i<s1.length();i++)
           if(Character.isAlphabetic(s1.charAt(i)) && Character.isUpperCase(s1.charAt(i)))
        b2=true;
   else
        {b2=false;break;}
 
        if(b2==true)
        for(int i=0;i<s2.length();i++)
        if(Character.isDigit(s2.charAt(i)))
          b=true;
   else
         {b=false;break;}
       return b;
}
}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String input = "DWQPP1651D3a";

		boolean b = false;
		boolean b1 = false;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if ((c >= 'A' && c <= 'Z') && input.length() == 8) {

				b1 = true;
			}

			if (b1 == true) {
				if ((input.charAt(0) >= 'A' && input.charAt(0) <= 'Z')
						&& (input.charAt(1) >= 'A' && input.charAt(1) <= 'Z')
						&& (input.charAt(2) >= 'A' && input.charAt(2) <= 'Z')) {
					int z = Integer.parseInt(input.valueOf(input.charAt(3)));
					int x = Integer.parseInt(input.valueOf(input.charAt(4)));
					int v = Integer.parseInt(input.valueOf(input.charAt(5)));
					int n = Integer.parseInt(input.valueOf(input.charAt(6)));
					if ((z >= 0 && z <= 9) && (x >= 0 && x <= 9) && (v >= 0 && v <= 9) && (n >= 0 && n <= 9)) {

						if (input.charAt(input.length() - 1) >= 'A' && input.charAt(input.length() - 1) <= 'Z') {
							b = true;
						}

					}
				}
			} else {
				System.out.println("Not in particuler FORMAT");
				break;
			}

			if (b == true) {
				System.out.println("+++ Valid +++ Pan card no.");
			} else {
				System.out.println("Not a ---Valid--- pan card no.");
			}
		}*/
		
		
		
		
		
		
		
		
	}
}
