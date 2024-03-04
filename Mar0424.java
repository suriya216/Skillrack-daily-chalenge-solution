import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String[] arr=sc.nextLine().split(" ");
		StringBuilder sb=new StringBuilder();
		while(N!=0){
		    int l=N%10;
		    N/=10;
		    sb.append(arr[l]);
		}
		sb.reverse();
		System.out.print(sb.toString());
		sc.close();
	}
}
