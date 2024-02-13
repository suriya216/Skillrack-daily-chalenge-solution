import java.util.*;
public class Hello {
    public static void swap(String []a, int s, int e){
        String temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []s=str.split(" ");
		String t=sc.next();
		for(int i=1;i<s.length-1;i++){
		    if(s[i].equals(t)){
		        swap(s, i-1, i+1);
		    }
		}
		for(String c: s){
		    System.out.print(c+" ");
		}
		sc.close();
	}
}
