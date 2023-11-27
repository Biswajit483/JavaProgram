package String;

public class SearchChart {
   public static void main(String[] args) {
	String sc="bisu12Rehlat422";
	int sum=0;
	for(int i=1;i<sc.length();i++) {
		char ch=sc.charAt(i);
		if(ch>='0' && ch<='9') {
			sum=sum+ch-48;
		}
	}
	System.out.println(sum);
}
}
