package Program1;

public class GreatestNum {
	 public static void main(String[] args) {
			int num=1234;
			int ld;
			int max=0;
			while(num>0) {
				ld=num%10;
				if(ld>max) {
					max=ld;
				}
				num=num/10;
			}
			System.out.println(max);
}
}
