import java.util.*;

public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double M=sc.nextDouble();
		double N=sc.nextDouble();
		int X=sc.nextInt();
		String format="%."+X+"f";
		System.out.print(String.format(format,M/N));
		sc.close();
	}
}
