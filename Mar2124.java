import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<N;i++){
		    if(i<=N/2){
		        s.add(i);
		        s.add(N-1-i);
		    }else{
		        s.remove(N-i);
		        if(s.contains(i-1)){
		            s.remove(i-1);
		        }
		    }
		    for(int j=0;j<N;j++){
		        if(s.contains(j)){
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		
		sc.close();
	}
}
