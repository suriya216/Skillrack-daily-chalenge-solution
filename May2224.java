import java.util.*;
public class Hello {
    public static boolean isPrime(int n){
        if(n==1||n==0){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		boolean f=false;
		for(int i=0;i<n-1;i++){
		    String t1=s.substring(0,i+1);
		    String t2=s.substring(i+1,n);
		    if(isPrime(Integer.parseInt(t1)) && isPrime(Integer.parseInt(t2))){
		        f=true;
		        System.out.print(t1+" "+t2);
		        break;
		    }
		}
		if(!f){
		    System.out.print(-1);
		}
		sc.close();
	}
}
