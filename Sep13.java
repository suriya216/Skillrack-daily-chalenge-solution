import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []s=str.split(" ");
		for(String a:s){
		    if(Integer.parseInt(a)==0){
		        System.out.print(a+" ");
		    }else{
		        System.out.print(-1*Integer.parseInt(a)+" ");
		    }
		}
	}
}
