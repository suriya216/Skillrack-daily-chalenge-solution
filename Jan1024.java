import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [][]arr=new int[N][N];
        int odd = 1, even = 2;
        for(int j=0;j<N;j++){
            boolean f = true;
            for(int i=0;i<N;i++){
                if(i==j){
                    arr[i][j]=0;
                    f=false;
                }
                else if(!f){
                    arr[i][j]=odd;
                    odd+=2;
                }else{
                    arr[i][j]=even;
                    even+=2;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
	}
}
