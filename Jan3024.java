import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Character> l1=new ArrayList<>();
		List<Character> l2=new ArrayList<>();
		String s1=sc.next();
		String s2=sc.next();
		for(int i=0;i<s1.length();i++){
		    l1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
		    l2.add(s2.charAt(i));
		}
		int count=0;
		boolean f=true;
		for(int i=0;i<l1.size();i++){
		    f=true;
		    for(int j=0;j<l2.size();j++){
		        if(l1.get(i)==l2.get(j)){
		            l2.remove(j);
		            f=false;;
		        }
		    }
		    if(f){
		        count++;
		    }
		}
		System.out.print(count);
		sc.close();
	}
}
