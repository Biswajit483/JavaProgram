package Pattern;

public class MirrorDaigonal {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
}
}
