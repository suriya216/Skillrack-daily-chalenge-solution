import java.util.*;

public class Hello {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int count=0;
	    int t=N;
	    for(int i=2;i<=N/2;i++){
	        t=N;
	        if(isPrime(i)){
	            t-=i;
	            if(isPrime(t)){
	                count++;
	            }
	        }
	    }
	    System.out.print(count);
	    sc.close();
	}
}
