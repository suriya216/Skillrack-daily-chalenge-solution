#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    if(((n%100)/10)%2!=0){
        printf("%d",n);
    }else{
        for(int i=n-1;i>=0;i--){
            n/=10;
            if(((n%100)/10)%2!=0){
                printf("%d",n);
            }
        }
    }
}
