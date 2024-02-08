import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    for(int i=1;i<=N/2;i++){
	        if((i*i)>N){
	            break;
	        }
	        System.out.print((i*i)+" ");
	    }
	    sc.close();
	}
}
