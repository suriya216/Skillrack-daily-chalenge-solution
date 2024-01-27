import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int val=1;
		int l=0, r=N-1;
		if(N%2==0){
		    for(int i=0;i<N;i++){
		        for(int j=0;j<N;j++){
		            if(i==j){
		                System.out.print(val+" ");
		                val++;
		            }
		            else if(i==l && j==r){
		                System.out.print(val+" ");
		                val++;
		            }
		            else{
		                System.out.print("* ");
		            }
		        }
		        System.out.println();
		        l++;
		        r--;
		    }
		}else{
		    l=0;
		    r=N-1;
		    val=1;
		    for(int i=0;i<N;i++){
		        for(int j=0;j<N;j++){
		            if(i==j){
		                System.out.print(val+" ");
		                val++;
		            }
		            else if(i==l && j==r){
		                System.out.print(val+" ");
		                val++;
		            }else{
		                System.out.print("* ");
		            }
		        }
		        System.out.println();
		        l++;
		        r--;
		    }
		}
		sc.close();
	}
}
