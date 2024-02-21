import java.util.*;
public class Hello {
    public static int consCount(String s){
        s=s.toLowerCase();
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            char t=s.charAt(i);
            if(t!='a'&&t!='e'&&t!='i'&&t!='o'&&t!='u'){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String []str=new String[N];
		for(int i=0;i<N;i++){
		    str[i]=sc.next();
		}
		int []count=new int[N];
		int min=Integer.MAX_VALUE, max=0;
		for(int i=0;i<N;i++){
		    count[i]=consCount(str[i]);
		    min=Math.min(min,count[i]);
		    max=Math.max(max,count[i]);
		}
		while(min<=max){
		    for(int i=0;i<N;i++){
		        if(count[i]==min){
		            System.out.print(str[i]+" ");
		        }
		    }
		    min++;
		}
		sc.close();
	}
}
