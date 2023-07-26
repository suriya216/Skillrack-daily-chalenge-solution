#include<stdio.h>
#include<stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int i,f,j;
for(i=1;i<=n;i++){
    f=0;
    for(j=2;j<=i/2;j++){
        if(i%j==0){
            f++;
            break;
        }
    }
    if(f==0&&i!=1){
        printf("%d ",i);
    }
}
printf("\n");
for(i=1;i<=n;i++){
    f=0;
    for(j=2;j<=i/2;j++){
        if(i%j==0){
            f++;
            break;
        }
    }
    if(f!=0){
        printf("%d ",i);
    }
}
}