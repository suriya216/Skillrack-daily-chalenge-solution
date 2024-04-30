import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []s=sc.next().split("-");
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "January");
		m.put(2, "February");
		m.put(3, "March");
		m.put(4, "April");
		m.put(5, "May");
		m.put(6, "June");
		m.put(7, "July");
		m.put(8, "August");
		m.put(9, "September");
		m.put(10, "October");
		m.put(11, "November");
		m.put(12, "December");
		int month=Integer.parseInt(s[1]);
		System.out.print(m.get(month));
		sc.close();
	}
}
