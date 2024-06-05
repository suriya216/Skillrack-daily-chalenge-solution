import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		Set<Integer> s=new HashSet<>();
		Map<Integer, Integer> m=new HashMap<>();
		int sum=0;
		for(int i=0;i<str.length;i++){
		    if(!s.contains(Integer.parseInt(str[i]))){
		        s.add(Integer.parseInt(str[i]));
		        sum+=Integer.parseInt(str[i]);
		    }
		    m.put(Integer.parseInt(str[i]), m.getOrDefault(Integer.parseInt(str[i]), 0)+1);
		}
	    for(Map.Entry<Integer, Integer> e:m.entrySet()){
		    if(e.getValue()==2){
		        System.out.print(e.getKey()+" ");
		    }
		}
		int totSum=str.length*(str.length+1)/2;
		System.out.print(totSum-sum);
		sc.close();
	}
}
