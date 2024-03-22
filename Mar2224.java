import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []A=new int[N];
		int min=1001, max=0;
		for(int i=0;i<N;i++){
		    A[i]=sc.nextInt();
		    max=Math.max(max, A[i]);
		    min=Math.min(min, A[i]);
		}
		for(int i=0;i<N;i++){
		    if(max==A[i]){
		        max=i;
		    }
		    if(min==A[i]){
		        min=i;
		    }
		}
		System.out.print((min+1)+" "+(max+1));
		sc.close();
	}
}
