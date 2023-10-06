import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []s=str.split(" ");
		Map<String,Integer> m=Map.of("zero",0 ,"one",1 ,"two",2 ,"three",3 ,"four",4 ,"five",5 ,"six",6 ,"seven",7, "eight",8 ,"nine",9);
		for(String a:s){
		    System.out.print(m.get(a));
		}
		sc.close();
	}
}
