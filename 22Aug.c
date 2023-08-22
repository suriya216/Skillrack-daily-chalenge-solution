#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    char arr[101];
    scanf("%s",arr);
    int N;
    scanf("%d",&N);
    int count=0,num=N;
    while(num>0){
        count++;
        num/=10;
    }
    if(strlen(arr)<count){
        printf("%s",arr);
        return 0;
    }
    while(N--){
        char c=arr[0];
        arr[0]=arr[1];
        for(int i=1;i<strlen(arr)-1;i++){
            arr[i]=arr[i+1];
        }
        arr[strlen(arr)-1]=c;
    }
    printf("%s",arr);
    return 0;
}