#include<stdio.h>
#include<stdlib.h>

int main()
{
    int N;
    scanf("%d",&N);
    while(N!=1){
        if(N==2){
            printf("2");
        }else{
            printf("2*");
        }
        N/=2;
    }
}
