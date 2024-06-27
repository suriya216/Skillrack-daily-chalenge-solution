import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int t=1;
		while(true){
		    int s=t;
		    for(int i=N-1;i>=0;i--){
		        if(s>=arr[i]){
		            s-=arr[i];
		        }
		    }
		    if(s!=0){
		        System.out.print(t);
		        break;
		    }
		    t++;
		}
		sc.close();
	}
}
