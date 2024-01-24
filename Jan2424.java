import java.util.*;
public class Hello {
    public static int rSum(int [][]arr, int N, int t){
        int sum1=0;
        for(int i=t;i<t+1;i++){
            for(int j=0;j<N;j++){
                sum1+=arr[i][j];
            }
        }
        return sum1;
    }
    public static int cSum(int [][]arr, int N, int t){
        int sum1=0;
        for(int j=t;j<t+1;j++){
            for(int i=0;i<N;i++){
                sum1+=arr[i][j];
            }
        }
        return sum1;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int [][]arr=new int[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int t=0, count=0;
		for(int i=0;i<N;i++){
		    t=i;
		    if(rSum(arr, N, t)==cSum(arr, N, t)){
		        count++;
		    }
		}
		System.out.print(count);
		sc.close();
	}
}
