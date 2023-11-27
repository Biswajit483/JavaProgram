package Program1;

import java.util.Scanner;

public class SearchElementArray {
        public static void main(String[] args) {
			int []arr= {20,40,50,68};
			//int k=50;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a num");
			int k=sc.nextInt();
			int count=0;
			for(int i=1;i<arr.length;i++) {
				int n=arr[i];
				if(k==n) {
					count++;
					break;
				}
			}
			if(count==1) {
				System.out.println("num found");
			}else {
				System.out.println("not found");
			}
		}
}
