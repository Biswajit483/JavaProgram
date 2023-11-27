package String;

public class Pallindrom {

	public static void main(String[] args) {
     String str="ABBA";
     String rev="";
     for(int i=str.length()-1;i>=0;i--) {
    	 char ch=str.charAt(i);
    	 rev=rev+ch;
     }
     System.out.println(rev);
     if(str.equalsIgnoreCase(rev)) {
    	 System.out.println("pallindrom num");
     }else {
    	 System.out.println(" not pallindrom num");
     }

}
}
