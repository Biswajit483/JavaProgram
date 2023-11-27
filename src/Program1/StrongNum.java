package Program1;

import java.util.Scanner;

public class StrongNum {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int ld;
			int num1=num;
			int sum=0;
			int fact=factorial(num);
			while(num!=0) {
				ld=num%10;
				fact=factorial(ld);
				sum=sum+fact;
				num=num/10;
			}
			if(num1==sum) {
				System.out.println(num1+ "Strong number");
			}else {
				System.out.println(num1+" is not a Strong number");
			}
		}
      public static int factorial(int a) {
     	 int fact=1;
     	 for(int i=1;i<=a;i++) {
     		 fact=fact*i;
     	 }
     	 return fact;
}
}
