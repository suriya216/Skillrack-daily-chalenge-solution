import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int m=(2*N)+1;
		for(int i=0;i<m;i++){
		    int a=1;
		    for(int j=0;j<m;j++){
		        if(i==N || j==N){
		            System.out.print('+'+" ");
		        }else{
		            System.out.print(a+" ");
		        }
		        if(j>N-1){
		            a--;
		        }else{
		            a++;
		        }
		    }
		    System.out.println();
		}
		sc.close();
	}
}
