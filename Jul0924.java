import java.util.*;
public class Hello {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long res=1;
		for(int i=2;i<=15*100&&N!=0;i++){
		    if(isPrime(i)){
		        res*=i;
		        N--;
		    }
		}
		System.out.print(String.valueOf(res));
		sc.close();
	}
}
