import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<N;i++){
		    l.add(sc.nextInt());
		}
		int K=sc.nextInt();
		int pos=-1;
		for(int i=0;i<N;i++){
		    if(l.get(i)==K){
		        pos=i;
		    }
		}
		for(int i=0;i<l.size();i++){
		    if(i==pos){
		        continue;
		    }
		    System.out.print(l.get(i)+" ");
		}
		sc.close();
	}
}
