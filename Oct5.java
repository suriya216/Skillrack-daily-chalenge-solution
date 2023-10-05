import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int min=Math.min(X,Math.min(Y,Z));
		int i=0;
		for(i=min;i>=1;--i){
		    if((X%i==0)&&(Y%i==0)&&(Z%i==0))
		        break;
		}
		System.out.print(i);
		sc.close();
	}
}
