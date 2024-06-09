import java.util.*;
public class Hello {
    public static int countup(int r, int c, int x, int y, int m, int n){
        if(x-1<0||(x-1==m && y==n)){
            return 0;
        }
        return 1+countup(r, c, x-1, y, m, n);
    }
    
    public static int countdown(int r, int c, int x, int y, int m, int n){
        if(x+1>=r||(x+1==m&&y==n)){
            return 0;
        }
        return 1+countdown(r, c, x+1, y, m, n);
    }
    
    public static int countleft(int r, int c, int x, int y, int m, int n){
        if(y-1<0||(x==m&&y-1==n)){
            return 0;
        }
        return 1+countleft(r, c, x, y-1, m, n);
    }   
    
    public static int countright(int r, int c, int x, int y, int m, int n){
        if(y+1>=c||(x==m&&y+1==n)){
            return 0;
        }
        return 1+countright(r, c, x, y+1, m, n);
    }
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int moves=0;
		moves+=countup(r, c, x, y, m, n);
		moves+=countdown(r, c, x, y, m, n);
		moves+=countleft(r, c, x, y, m, n);
		moves+=countright(r, c, x, y, m, n);
		System.out.print(moves);
		sc.close();
	}
}
