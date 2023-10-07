import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int j=0, sum=0;
		for(int i=1;i<=N;i++){
		    if(Math.pow(2,j)==i){
		        sum-=i;
		        j++;
		    }else{
		        sum+=i;
		    }
		}
		System.out.print(sum);
		sc.close();
	}
}
