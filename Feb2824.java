import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int c=1;
		for(int i=str.length()-1;i>=0;i--){
		    System.out.print(str.charAt(i));
		    i=i-c;
		    c++;
		}
		sc.close();
	}
}
