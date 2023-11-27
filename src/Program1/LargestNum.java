package Program1;

import java.util.Scanner;

public class LargestNum {

	 public static void main(String[] args) {
     	Scanner sc=new Scanner(System.in);
     	System.out.println("enter the length");
     	int length=sc.nextInt();
     	int []arr=new int[length];
     	for(int i=0;i<arr.length;i++) {
     		arr[i]=sc.nextInt();
     	}
     	int max=arr[0];
     	for(int i=0;i<arr.length;i++) {
     		int n=arr[i];
     		if(n>max) {
     			max=n;
     		}
     	}
     	System.out.println(max);

	}

}
