import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, currNum, total=0, ctr=1;
		N = sc.nextInt();
		while(ctr <= N){
		    currNum = sc.nextInt();
		    if(currNum % 2 == 0){
		        total += currNum;
		    }else{
		        total -= currNum;
		    }
		    ctr++;
		}
		System.out.print(total);
		sc.close();
	}
}
