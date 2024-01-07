import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    List <Integer> l = new ArrayList<>();
	    for(int i=0;i<N;i++){
	        l.add(sc.nextInt());
	    }
	    int X = sc.nextInt();
	    int Y = sc.nextInt();
	    int f=0;
	    for(int i=0;i<N;i++){
	        int t=l.get(i);
	        if(t % Y == 0){
	            String s = String.valueOf(t);
	            if(X==s.length()){
	                System.out.print(t+" ");
	                f=1;
	            }
	        }
	    }
	    if(f==0){
	        System.out.print(-1);
	    }
	    sc.close();
	}
}
