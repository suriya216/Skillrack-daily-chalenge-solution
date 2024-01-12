import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int sum=0;
		for(int i=0;i<N;i++){
		    if(arr[i]>=X && arr[i]<=Y){
		        sum+=arr[i];
		    }
		}
		System.out.print(sum);
		sc.close();
	}
}
