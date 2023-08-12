import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String c=sc.next();
		str=str.replace(c,"");
		System.out.print(str);
	}
}
