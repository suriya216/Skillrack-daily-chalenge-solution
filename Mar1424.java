import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Set<Character> s=new HashSet<>();
		for(int i=0;i<str.length();i++){
		    s.add(str.charAt(i));
		}
		System.out.print(s.size()==3?"yes":"no");
		sc.close();
	}
}
