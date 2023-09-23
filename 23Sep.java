import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=N+1;i<=N+3;i++){
		    if(i%3==0){
		        System.out.print(i);
		    }
		}
		sc.close();
	}
}
