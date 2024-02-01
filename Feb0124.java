import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		String s1=String.valueOf(X);
		String s2=String.valueOf(Y);
		char []arr1=s1.toCharArray();
		char []arr2=s2.toCharArray();
		String t1="";
		String t2="";
		for(int i=0;i<arr1.length;i++){
		    if(arr1[i]=='6'){
		        t1+='5';
		    }else{
		        t1+=arr1[i];
		    }
		}
		for(int i=0;i<arr2.length;i++){
		    if(arr2[i]=='6'){
		        t2+='5';
		    }else{
		        t2+=arr2[i];
		    }
		}
		int val1=Integer.parseInt(t1)+Integer.parseInt(t2);
		t1="";
		t2="";
	    for(int i=0;i<arr1.length;i++){
	        if(arr1[i]=='5'){
	            t1+='6';
	        }else{
	            t1+=arr1[i];
	        }
	    }
	    for(int i=0;i<arr2.length;i++){
	        if(arr2[i]=='5'){
	            t2+='6';
	        }else{
	            t2+=arr2[i];
	        }
	    }
	    int val2=Integer.parseInt(t1)+Integer.parseInt(t2);
	    System.out.println(Math.min(val1, val2));
	    System.out.print(Math.max(val1,val2));
		sc.close();
	}
}
