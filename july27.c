#include<stdio.h>
#include<stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int arr[n],i=0,j=0;
for(i=0;i<n;i++){
    scanf("%d",&arr[i]);
}
int min=100,count;
for(i=0;i<n;i++){
    count=0;
    for(j=1;j<=arr[i];j++){
        if(arr[i]%j==0){
            count++;
        }
    }
    if(count<min){
        min=count;
        }
    }
printf("%d",min);
}