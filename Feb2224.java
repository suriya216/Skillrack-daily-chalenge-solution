import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char []str=sc.next().toCharArray();
		Arrays.sort(str);
		int n=str.length;
		int []cDiff=new int[n-1];
		cDiff[0]=str[1]-str[0];
		for(int i=1;i<n-1;i++){
		    int j=i+1;
		    int diff=str[j]-str[i];
		    cDiff[i]=diff;
		}
// 		for(int i:cDiff){
// 		    System.out.print(i+" ");
// 		}
		for(int i=1;i<n-1;i++){
		    if(cDiff[i-1]==cDiff[i]){
		        continue;
		    }else if(i==1 && cDiff[i]!=cDiff[i-1]){
		        System.out.print(str[0]);
		    }else{
		        System.out.print(str[i+1]);
		    }
		}
		sc.close();
	}
}
