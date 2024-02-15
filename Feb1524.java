import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int[N];
		boolean dec=true, asc=true;
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++){
		    if(arr[i]>arr[i+1]){
		        asc=false;
		    }
		}
		for(int i=0;i<N-1;i++){
		    if(arr[i]<arr[i+1]){
		        dsc=false;
		    }
		}
		if(asc || dsc){
		    System.out.print("yes");
		}else{
		    System.out.print("no");
		}
		sc.close();
	}
}
