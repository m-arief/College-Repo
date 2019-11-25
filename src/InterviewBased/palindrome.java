package InterviewBased;

import java.util.Scanner;

public class palindrome {
	
	
	
	
	
//public static void palindromeconcept(int numb) {
		
//		int r = 0;// reversed variable
//		int sum = 0;
//		int t;
//		
//	t= numb; 
//	
//	while(numb>0) {
//	
//		r= numb%10; //reminder
//		sum = (sum*10)+r;
//		numb = numb/10;
//		}
//	
//	if (t==sum) {
//		System.out.println("This is Palindrome number");
//	}else {
//		System.out.println("Not Palindrome number");
//	}
//	}


	public static void main(String[] args) {
		
		//palindromeconcept(121);
		
		
		
		// Objects of String class
	     // Scanner in = new Scanner(System.in);
	     
	     // System.out.println("Enter a string to check if it is a palindrome");
	     // original = in.nextLine();
		
		   String s = "121";
		
	      int length = s.length();
	      String  reverse = ""; 
	      
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + s.charAt(i);
	         
	      if (s.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	  
		
	}
		
}


