#include<stdio.h>
#include<stdlib.h>
long fact(int x){
    long fact=1;
    for(int i=x;i>=1;i--){
        fact=fact*i;
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    long x=fact(a);
    long y=fact(b);
    if(a==b){
        printf("%ld",fact(a));
        return 0;
    }
    printf("%ld",(a<b)?x:y);
}
