import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int [][]mat=new int[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		int K=sc.nextInt();
		int ind1=0, ind2=0;
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        if(mat[i][j]==K){
		            ind1=i;
		            ind2=j;
		        }
		    }
		}
		int top=ind1, bottom=ind1, left=ind2, right=ind2;
		while(top>=0 && bottom<R && left>=0 && right<C){
		    top--;
		    bottom++;
		    left--;
		    right++;
		}
		top++;
		bottom--;
		left++;
		right--;
		for(int i=top;i<=bottom;i++){
		    for(int j=left;j<=right;j++){
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}
