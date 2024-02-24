import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    sc.nextLine();
	    String []str1=sc.nextLine().split(" ");
	    String []str2=sc.nextLine().split(" ");
	    int f=0;
	    int i=0, j=N-1;
	    while(i<N){
	       if(str1[i].equals(str2[j])){
	           f++;
	       }
	        i++;
	        j--;
	    }
	    if(f==N){
	        System.out.print("1");
	    }else{
	        System.out.print("0");
	    }
	    sc.close();
	}
}
