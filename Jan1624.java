import java.util.*;
public class Hello {
    public static String binary(int n){
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(binary(Integer.parseInt(binary(N))));
        sc.close();
	}
}
