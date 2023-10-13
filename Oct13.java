import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int f=0;
		for(int i=0;i<str.length();i++){
		    if(Character.isUpperCase(str.charAt(i))){
		        f=1;
		    }else{
		        f=0;
		        break;
		    }
		}
		if(f==1){
		    System.out.print("VALID");
		    System.exit(0);
		}
		for(int i=0;i<str.length();i++){
		    if(Character.isLowerCase(str.charAt(i))){
		        f=2;
		    }else{
		        f=0;
		        break;
		    }
		}
		if(f==2){
		    System.out.print("VALID");
		    System.exit(0);
		}
		if(Character.isUpperCase(str.charAt(0))){
		    for(int i=1;i<str.length();i++){
		        if(Character.isLowerCase(str.charAt(i))){
		            f=3;
		        }else{
		            f=0;
		            break;
		        }
		    }
		}
		if(f==3){
		    System.out.print("VALID");
		    System.exit(0);
		}else{
		    System.out.print("INVALID");
		}
		sc.close();
	}
}
