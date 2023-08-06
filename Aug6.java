import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String s1=s.replace(s.charAt(n-1),'0');
		int num=Integer.parseInt(s1);
		System.out.print(num);
	}
}
