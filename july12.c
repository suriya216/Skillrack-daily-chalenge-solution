#include<stdio.h>
#include<stdlib.h>

int main()
{
int n,flag=0;
scanf("%d",&n);
int revn=0,rem;
if(n==0||n==1){
    printf("NO");
}else{
    int i=0;
    for(i=2;i<=n/2;i++){
        if(n%2==0){
            flag=1;
            break;
        }
    }
    if(flag==1)
        printf("NO");
    else
        printf("YES");
}
}