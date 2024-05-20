private static long getIntegerWithDigitsCount(int N) {
    String s=String.valueOf(N);
    String res="";
    int l=s.length();
    char prev='a';
    for(int i=0;i<l;i++){
        char t=s.charAt(i);
        if(prev==t){
            continue;
        }
        int count=1;
        for(int j=i+1;j<l;j++){
            char t2=s.charAt(j);
            if(t==t2){
                count++;
            }else{
                break;
            }
        }
        res+=count+""+t;
        prev=t;
    }
    long ans=Long.parseLong(res);
    return ans;
}
