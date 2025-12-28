package javapractice;
import java.util.Scanner;
public class Stringpalindrome2 {

		public static void main(String[] args) {
			boolean isPalindrome=true;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your String");
		    String name=sc.nextLine();
		    int left=0;
		    int right=name.length()-1;
		    while(left<right) {
		    	if(name.charAt(left)!=name.charAt(right)) {
		    		isPalindrome=false;
		    		break;
		    	}
		    	left++;
		    	right--;
		    }
		    if(isPalindrome) {
		    	System.out.println("Palindrome");
		    }else {
		    	System.out.println("Not Palindrome");
		    }
		    		

		}

	}

