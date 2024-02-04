import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<N-1;i++){
	       max=Math.max(max, Math.abs(arr[i]-arr[i+1]));
		}
		System.out.print(max);
		sc.close();
	}
}
