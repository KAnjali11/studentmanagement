package javapractice;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class collectionpreactice {
		public static int  practicelist(int[] arr) {
			List<Integer> even=new ArrayList<>();
			List<Integer> odd=new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				if(i%2==0) {
					even.add(arr[i]);
				}
				else {
					odd.add(arr[i]);
				}
			}
			Collections.sort(even);
			Collections.sort(odd);
			System.out.println(even);
			System.out.println(odd);
			System.out.println(even.size()-2);
			System.out.println(odd.get(1));

			return even.get(even.size()-2)+odd.get(1);
		}

		public static void main(String[] args) {
			System.out.println(practicelist(new int[]{3,4,5,6,7,8,9}));
			
		}

	}


