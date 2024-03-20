import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		boolean f=false;
		int l=0, r=N-1;
		while(l<=r){
		    int tot=arr[l]+arr[r];
		    if(tot>K){
		        r--;
		    }else if(tot<K){
		        l++;
		    }else if(tot==K){
		        f=true;
		        break;
		    }
		}
		if(f){
		    System.out.print("yes");
		}else{
		    System.out.print("no");
		}
		sc.close();
	}
}
