#include<stdio.h>
#include<stdlib.h>

int main()
{
    int N,K;
    scanf("%d %d",&N,&K);
    int arr[N],j=0,i=0;
    for(i=1;i<=N;i++){
        if(i%2!=0){
            arr[j]=i;
            j++;
        }
    }
    for(i=1;i<=N;i++){
        if(i%2==0){
            arr[j]=i;
            j++;
        }
    }
    printf("%d",arr[K-1]);
}
