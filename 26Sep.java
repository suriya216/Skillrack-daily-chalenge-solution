import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();
		long Y=sc.nextLong();
		long K=sc.nextLong();
		long val=0;
		for(long i=0;i<K;i++){
		    if(i%2==0){
		        val+=X;
		    }else if(i%2!=0){
		        val-=Y;
		    }
		}
		System.out.print(val);
	}
}
