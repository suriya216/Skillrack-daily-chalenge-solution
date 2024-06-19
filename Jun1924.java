import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		int t=N;
		while(N!=0){
		    sb.append(N%2);
		    N/=2;
		}
		sb.reverse();
		String bin=sb.toString();
		System.out.print(bin);
		char []binArr=bin.toCharArray();
		int res=t;
		for(int i=0;i<binArr.length;i++){
		    String temp="";
		    for(int j=0;j<binArr.length;j++){
		        if(i==j){
		            if(binArr[i]=='0'){
		                temp+="1";
		            }else if(binArr[i]=='1'){
		                temp+="0";
		            }
		        }else{
		            temp+=binArr[j];
		        }
		    }
		    res=Integer.max(Integer.parseInt(temp, 2), res);
		}
		System.out.print(res);
		sc.close();
	}
}
