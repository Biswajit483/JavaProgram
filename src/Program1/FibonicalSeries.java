package Program1;

import java.util.Scanner;

public class FibonicalSeries {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;int b=1;
		if(n==1) {
			System.out.println(a);
		}else if(n==2) {
			System.out.print(a+""+b);
		}else if(n>=3){
			System.out.print(a+""+b);
			for(int i=3;i<=n;i++) {
				int c=a+b;
				a=b;
				b=c;
			
			System.out.print(c+"");
			}
		}
	}
}
