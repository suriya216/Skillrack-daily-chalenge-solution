import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=0,b=10,c=0;
        a=(x%100)/10;
        b=(y%100)/10;
        c=(z%100)/10;
        if(a>b&&a>c)
            System.out.print(x);
        else if(b>a&&b>c)
            System.out.print(y);
        else if(c>a&&c>b)
            System.out.print(z);
        else if(a==b&&a>c)
            System.out.print(x>y?x:y);
        else if(b==c&&b>a)
            System.out.print(y>z?y:z);
        else if(a==c&&a>b)
            System.out.print(x>z?x:y);
        else if(a==b && a==c){
            if(x>y&&x>z){
                System.out.print(x);
            }else if(y>z&&y>x){
                System.out.print(y);
            }else{
                System.out.print(z);
            }
        }
	}
}
