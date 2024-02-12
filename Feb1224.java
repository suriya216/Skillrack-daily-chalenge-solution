import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		boolean flag=false;
		int count=0;
		for(int i=0;i<N;i++){
		    if(arr[i]==X){
		        flag=true;
		    }else if(flag && arr[i]%X==0){
		        count++;
		    }
		}
		System.out.print(count);
// 		int count=0, j=2, start=0;
// 		for(int i=0;i<N;i++){
// 		    if(arr[i]==X){
// 		        start=i;
// 		        break;
// 		    }
// 		}
// 		for(int i=start;i<N;i++){
// 		    if(arr[i]*j%X==0 && arr[i]>X){
// 		        count++;
// 		    }
// 		    j++;
// 		}
		System.out.print(count);
		sc.close();
	}
}
