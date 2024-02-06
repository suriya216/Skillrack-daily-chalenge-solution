import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		double n=Double.parseDouble(str);
		double first=Double.parseDouble(str.substring(0,str.length()/2));
		double second=Double.parseDouble(str.substring(str.length()/2, str.length()));
		double res1=Math.sqrt(first);
		double res2=Math.sqrt(second);
		double ans=Math.sqrt(n);
        if(Math.pow(Math.ceil(res1),2)==first && Math.pow(Math.ceil(res2),2)==second && Math.pow(Math.ceil(ans),2)==n){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
		sc.close();
	}
}
