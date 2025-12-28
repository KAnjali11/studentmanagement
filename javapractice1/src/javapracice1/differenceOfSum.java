package javapracice1;
import java.util.Scanner;
public class differenceOfSum {
		public static void main(String[] args) {
			int sum1=0,sum2=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter he value of n");
			int n=sc.nextInt();
			System.out.println("Enter the value of m");
			int m=sc.nextInt();
			for(int i=1;i<=m;i++) {
				if(i%n!=0) {
					sum1=sum1+i;
				}
				else {
					sum2=sum2+i;
				}
			}
			System.out.println(sum1);
			System.out.println(sum2);
			System.out.println("value:" + (sum1-sum2));
		}
	}


