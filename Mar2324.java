import java.util.*;
public class Hello {
    public static boolean halfEqual(String s){
        for(int i=0;i<s.length();i++){
            String s1="";
            for(int j=0;j<i;j++){
                s1+=s.charAt(j);
            }
            String s2="";
            for(int j=i+1;j<s.length();j++){
                s2+=s.charAt(j);
            }
            String val=s1+s2;
            if((val.substring(0,val.length()/2)).equals(val.substring(val.length()/2,s.length()-1))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(halfEqual(s)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
