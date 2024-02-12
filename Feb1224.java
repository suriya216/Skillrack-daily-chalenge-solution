import java.util.*;
public class Hello {
    public static long concat(char ch){
        long s=ch-'0';
        String temp="";
        while(s!=-1){
            temp+=s;
            s--;
        }
        return Long.parseLong(temp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        long res=0;
        long total=0;
        for(int i=0;i<str.length();i++){
            res+=concat(str.charAt(i));
            total+=res;
            res=0;
        }
        System.out.println(total);
        sc.close();
	}
}
