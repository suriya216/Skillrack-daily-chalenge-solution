import java.util.*;
public class Hello {
    public static String reverse(String s){
        int l=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<l;i++){
            sb.append(s.charAt(i));
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		for(int i=0;i<str.length;i++){
		    System.out.print(reverse(str[i])+" ");
		}
		sc.close();
	}
}
