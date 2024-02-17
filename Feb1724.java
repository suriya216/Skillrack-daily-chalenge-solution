import java.util.*;
public class Hello {
    public static boolean isPallindrome(String s){
        int l=0, r=s.length()-1;
        boolean f=true;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                f=false;
                break;
            }
        }
        return f;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String []str=new String[N];
		for(int i=0;i<N;i++){
		    str[i]=sc.next();
		}
		int max=0;
		for(int i=0;i<N;i++){
		    if(isPallindrome(str[i])){
		        max=Math.max(max, str[i].length());
		    }
		}
		System.out.print(max);
		sc.close();
	}
}
