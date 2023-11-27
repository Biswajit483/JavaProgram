package Program1;

public class LengthOfArray {
	public static void main(String[] args) {
		int []arr= {10,30,40,50};
		int count=0;
		for(int i=1;true;i++) {
		try {
			int n=arr[i];
			count++;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			break;
		}
		}
		System.out.println("length of array"+count);
}
}
