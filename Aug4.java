import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String v="aeiouAEIOU";
        for(int i=0,j=i+1;i<s.length()&&j<s.length();i++,j++)
        {
         if(v.indexOf(s.charAt(i))<0&&v.indexOf(s.charAt(j))>=0){
             System.out.print(s.charAt(i)+""+s.charAt(j)+" ");
         }   
        }
	}
}
