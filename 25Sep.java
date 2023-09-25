import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=1;
		System.out.print(str.charAt(0));
		for(int i=1;i<str.length();i+=k){
		    System.out.print(str.charAt(i));
		    k++;
		}
		sc.close();
	}
}
