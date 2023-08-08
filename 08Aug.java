import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int max=(x>y)?x:y;
		if(max==x){
		    for(int i=x;i<=x*10;i++){
		        if(i%max==0){
		            System.out.print(i+" ");
		        }
		    }
		}
		else{
		    for(int i=y;i<=y*10;i++){
		        if(i%max==0){
		            System.out.print(i+" ");
		        }
		    }
		}
	}
}
