import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int f=0;
		for(int i=1;i<str.length();i++){
		    if(str.charAt(0)==str.charAt(i)){
		        f=1;
		    }else{
		        f=0;
		        break;
		    }
		}
		if(f==1){
		    System.out.print("YES");
		}else{
		    System.out.print("NO");
		}
		sc.close();
	}
}
