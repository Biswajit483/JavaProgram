package Program1;

import java.util.Scanner;

public class CountOfFactors {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
   	  System.out.println("enter the num");
   	  int num=sc.nextInt();
		//int num=6;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println("COUNT OF NUMBER IS:"+count);

	}

}
