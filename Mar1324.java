import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String[] str=sc.nextLine().split(" ");
		List<String> l=new ArrayList<>();
		for(String s:str){
		    l.add(s);
		}
		Collections.sort(l);
		System.out.println(l.get(0));
		System.out.println(l.get(l.size()-1));
		sc.close();
	}
}
