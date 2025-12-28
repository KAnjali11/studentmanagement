package javapracice1;
import java.util.Scanner;

public class Stringpalindrome {
		public static void main(String[] args) {
			String rev="";
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your String");
			String name=sc.nextLine();
			for(int i=name.length()-1;i>=0;i--) {
				rev=rev+name.charAt(i);
			}
			
			System.out.println(rev);
			if(name.equals(rev)) {
				System.out.println("palindrome");
			}else {
				System.out.println("not palindrome");
			}
		}

	}


