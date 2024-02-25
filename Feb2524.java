import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int r=N*2-1, c=N*2-1, b=N;
		int [][]res=new int[r][c];
		for(int i=0;i<=r/2;i++){
		    int temp=b;
		    for(int j=0;j<=c/2;j++){
		        res[i][j]=temp;
		        res[i][c-j-1]=temp;
		        res[r-i-1][j]=temp;
		        res[r-i-1][c-j-1]=temp;
		        if(j>=i){
		            temp--;
		        }
		    }
		    b--;
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(res[i][j]+" ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}
