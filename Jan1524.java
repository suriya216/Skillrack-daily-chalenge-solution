import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int [][]arr=new int[N][N];
		int [][]res=new int[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int max=0;
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        if(i==0||j==0){
		            res[i][j]=arr[i][j];
		        }else if(arr[i][j]==1){
		            res[i][j]=Math.min(Math.min(res[i-1][j],res[i][j-1]),res[i-1][j-1])+1;
		        }
		        max=Math.max(max, res[i][j]);
		    }
		}
		System.out.print(max*max);
		sc.close();
	}
}
