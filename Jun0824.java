import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    String str=sc.next();
		    String domain=str.substring(str.indexOf('@')+1);
		    m.put(domain, m.getOrDefault(domain, 0)+1);
		}
		List<Map.Entry<String, Integer>> l=new LinkedList<>(m.entrySet());
		
		Collections.sort(l, (a,b)->{
		    if(a.getValue().equals(b.getValue())){
		        return a.getKey().compareTo(b.getKey());
		    }else{
		        return b.getValue().compareTo(a.getValue());
		    }
		});
		for(Map.Entry<String, Integer> a:l){
		    System.out.println(a.getKey());
		}
		sc.close();
	}
}
