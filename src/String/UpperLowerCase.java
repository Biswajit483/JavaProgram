package String;

public class UpperLowerCase {
           public static void main(String[] args) {
			String str="Bisu";
			String temp="";
			for(int i=0;i<=str.length();i++) {
				char ch=str.charAt(i);
				if(ch>='A' && ch<='Z') {
					temp=temp+(char)(ch+32);
				}else if(ch>='a' && ch<='z') {
					temp=temp+(char)(ch-32);
				}else {
					temp=temp+ch;
				}
			}
			System.out.println(temp);
		}
}
