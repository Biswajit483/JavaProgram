package Program1;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		int a=sc.nextInt();
		System.out.println("enter 2st num");
		int b=sc.nextInt();
		while(a>b) {
			a=a+b;//70
			b=a-b;//50
			a=a-b;//20
			System.out.println(a+"is 1st num");
			System.out.println(b+"is 2st num");		
			}
}
}
