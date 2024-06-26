import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int t=N;
		while(t!=0){
		    if(t%K==0){
		        break;
		    }
		    t/=10;
		}
		if(t!=0){
		    System.out.print(t);
		}else{
		    System.out.print(-1);
		}
		sc.close();
	}
}
