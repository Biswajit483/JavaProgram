package Program1;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the number");
			  int num=sc.nextInt();
			  int num1=num;
			  int ld;
			  int sum=0;
			  int p;
			  int count=countDigit(num);
			  while(num!=0) {
				  ld=num%10;
				  p=powerNum(ld,count);
				  sum=sum+p;
				  num=num/10;
			  }
			  if(num1==sum) {
				  System.out.println(num1+"Amstrong number");
			  }else {
				  System.out.println(num1+"is not an Amstrong number");
			  }
		}
		      public static int countDigit(int num) {
		    	  int count=0;
		    	  while(num!=0) {
		    		  count++;
		    		  num=num/10;
		    		  
		    	  }
		    	  return count;
		      }
		      public static int powerNum(int x,int n) {
		    	  int power=1;
		    	  for(int i=1;i<=n;i++) {
		    		  power=power*x;
		    	  }
		    	  return power;
		      }
		}


	