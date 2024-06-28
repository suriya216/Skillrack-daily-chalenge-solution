import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		boolean f=false;
		for(int i=X;i<=Y;i++){
		    String str=String.valueOf(i);
		    if(str.contains("0")){
		        System.out.print(str+" ");
		        f=true;
		    }
		}
		if(!f){
		    System.out.print(-1);
		}
		sc.close();
	}
}
