import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double T=sc.nextDouble();
		double F= ((T*9*1.0)/(5*1.0))+32;
		System.out.printf("%.2f",F);
		sc.close();
	}
}
