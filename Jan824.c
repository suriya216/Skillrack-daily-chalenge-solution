#include<stdio.h>
#include<stdlib.h>

int main()
{
    int N;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++){
        scanf("%d",&arr[i]);
        if(arr[i]%2==0){
            arr[i]*=2;
        }else{
            arr[i]*=arr[i];
        }
        printf("%d ",arr[i]);
    }
}
