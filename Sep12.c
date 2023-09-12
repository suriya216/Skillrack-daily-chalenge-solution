#include<stdio.h>
#include<stdlib.h>

int max(int a, int b){
    return a>b?a:b;
}
int main()
{
    int m,n,i=0;
    scanf("%d %d",&m,&n);
    int arr1[m];
    for(i=0;i<m;i++){
        scanf("%d",&arr1[i]);
    }
    int arr2[n];
    for(i=0;i<n;i++){
        scanf("%d",&arr2[i]);
    }
    if(m==n){
        for(i=n-1;i>=0;i--){
            printf("%d ",max(arr1[i],arr2[i]));
        }
    }else{
        while(m-- && n--){
            printf("%d ",max(arr1[m],arr2[n]));
        }
        for(i=m;i>-1;i--){
            printf("%d ",arr1[i]);
        }
        for(i=n;i>-1;i--){
            printf("%d ",arr2[i]);
        }
    }
}
