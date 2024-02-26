import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		while(X<=Y){
		    System.out.print(X+" ");
		    X++;
		}
		sc.close();
	}
}
