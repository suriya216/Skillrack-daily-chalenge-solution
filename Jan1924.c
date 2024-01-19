char* getOddEvenString(int N)
{
    int t=N, count=0;
    while(t!=0){
        count++;
        t/=10;
    }
    char *res=(char *)malloc(count+1);
    while(N!=0){
        res[count-1]=(N%10)%2==0?'e':'o';
        count--;
        N/=10;
    }
    res[count-1]='\0';
    return res;
}
