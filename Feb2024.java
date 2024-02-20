import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int T=sc.nextInt();
		int P=(A/T)*100;
		if(P>75){
		    System.out.print("Allowed to exam hall");
		}else{
		    System.out.print("Not allowed");
		}
		sc.close();
	}
}
