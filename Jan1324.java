import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String str=String.valueOf(N);
		int len=str.length();
		int mid=len/2;
		int sum=Integer.parseInt(str.substring(0,mid))*Integer.parseInt(str.substring(mid,len));
		System.out.print(sum);
		sc.close();
	}
}
