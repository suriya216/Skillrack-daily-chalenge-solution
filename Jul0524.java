import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		String []arr=N.split("");
		int unit=N.charAt(N.length()-1)-'0';
		Map<Integer, Integer> s=new HashMap<>();
		for(int i=0;i<arr.length-1;i++){
		    for(int j=0;j<arr.length-1;j++){
		        int n1=Integer.parseInt(arr[i]);
		        int n2=Integer.parseInt(arr[j]);
		        if(i!=j && n1+n2==unit){
		            if(n1>n2){
		                s.put(n2, n1);
		            }else{
		                s.put(n1, n2);
		            }
		        }
		    }
		}
		if(s.size()==0){
		    System.out.print(-1);
		}else{
		    System.out.print(s.size());
		}
		sc.close();
	}
}
