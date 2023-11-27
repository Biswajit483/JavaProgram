package Program1;

public class LargestNum1 {
	 public static void main(String[] args) {
			int []arr= {10,30,40,50,60};
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				int largest=arr[i];
				if(largest>max) {
					max=largest;
				}
			}
			System.out.println("largest num is "+max);
}
}
