import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    String digit="";
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        if(ch>='0'&&ch<='9'){
	            digit+=ch;
	        }else{
	            System.out.print(ch);
	        }
	    }
	    System.out.print(digit);
	    sc.close();
	}
}
