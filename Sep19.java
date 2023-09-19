import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s="";
		int aC=0, eC=0, iC=0, oC=0, uC=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='a'){
	            aC++;
	        }
	        else if(str.charAt(i)=='e'){
	            eC++;
	        }else if(str.charAt(i)=='i'){
	            iC++;
	        }else if(str.charAt(i)=='o'){
	            oC++;
	        }else if(str.charAt(i)=='u'){
	            uC++;
	        }
	    }
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
	            System.out.print(ch);
	        }else if(aC==1 && ch=='a'){
	            System.out.print(ch);
	        }else if(eC==1 && ch=='e'){
	            System.out.print(ch);
	        }else if(iC==1 && ch=='i'){
	            System.out.print(ch);
	        }else if(oC==1 && ch=='o'){
	            System.out.print(ch);
	        }else if(uC==1 && ch=='u'){
	            System.out.print(ch);
	        }
	    }
	}
}
