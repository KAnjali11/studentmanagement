package javapractice;
import java.util.Scanner;
public class palindrome {
	
	
	
		public static void main(String[] args) {
			int num ,rev=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
	        num=sc.nextInt();
	        int temp=num;
	        while(num>0) {
	        	rev=rev*10+num%10;
	        	num/=10;
	        }
	        if(rev==temp) {
	        	System.out.println("palindrome");
	        }
	        else {
	        	System.out.println("Not palindrome");
	        }
		}

	}


