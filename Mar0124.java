import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long res=1;
		for(long i=B+1;i<=A;i++){
		    res*=i;
		}
		System.out.print(res);
	
