ULL concatenateFirstAndLastXDigits(int N, int X)
{
    int t=N, count=0;
    while(t!=0){
        count++;
        t/=10;
    }
    int arr[count];
    t=N;
    int i=0;
    while(t>0){
        arr[i++]=t%10;
        t/=10;
    }
    long long int res=0;
    for(i=count-1;i>=count-X;i--){
        res=res*10+arr[i];
    }
    for(i=X-1;i>=0;i--){
        res=res*10+arr[i];
    }
    return res;
}
