package Program1;

import java.util.Scanner;

public class ReverseNum {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int rev=0;
			int ld;
			while(num>0) {
				ld=num%10;
				rev=rev*10+ld;
				num=num/10;
			}
			System.out.println("reverse num is:"+rev);
}
}
