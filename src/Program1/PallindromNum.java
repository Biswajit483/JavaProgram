package Program1;

import java.security.DomainCombiner;
import java.util.Scanner;

public class PallindromNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int ld;
	int rev=0;
	int num1=num;
	while(num>0) {
		ld=num%10;
		rev=rev*10+ld;
		num=num/10;
	}
	if(rev==num1) {
		System.out.println(num1+" is a Pallindrom number");
	}else {
		System.out.println(num1+" is not a Pallindrom number");

	}
	}
}
