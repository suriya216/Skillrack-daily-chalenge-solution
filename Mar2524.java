import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int res=0;
		for(int i=0;i<str.length();i++){
		    int c=str.charAt(i)-'0';
		    if(c>=0 && c<=9){
		        res+=c;
		    }
		}
		System.out.print(res);
		sc.close();
	}
}
