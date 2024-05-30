import java.util.*;
public class Hello {
    public static String removeChar(String s1, String s2){
        StringBuilder res=new StringBuilder();
        for(char ch:s1.toCharArray()){
            if(s2.indexOf(ch)==-1){
                res.append(ch);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []str=sc.nextLine().split(" ");
		int N=str.length;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N-1;i++){
		    sb.append(removeChar(str[i], str[i+1])).append(" ");
		}
		sb.append(str[N-1]);
		String ans=sb.toString();
	    ans=ans.replaceAll("\\s+", " ");
		System.out.print(ans);
		sc.close();
	}
}
