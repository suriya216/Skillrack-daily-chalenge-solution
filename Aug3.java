import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int p=0,q=0;
		for(int i=0;i<N;i++){
		    if(arr[i]%X==0){
		        p=i;
		        break;
		    }
		}
		for(int i=N-1;i>=0;i--){
		    if(arr[i]%Y==0){
		        q=i;
		        break;
		    }
		}
		int t=p;
		p=q;
		q=t;
		for(int i=0;i<N;i++){
		    if(i==p)
		        System.out.print(arr[q]+" ");
		    else if(i==q)
		        System.out.print(arr[p]+" ");
		    else
		        System.out.print(arr[i]+" ");
		}
	}
}
