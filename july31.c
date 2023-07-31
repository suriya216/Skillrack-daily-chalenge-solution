#include<stdio.h>
#include<stdlib.h>

int main()
{
int x,y,a,b,c,i;
scanf("%d %d\n%d %d %d",&x,&y,&a,&b,&c);
for(i=x;i<=y;i++){
    if(i%a==0||i%b==0||i%c==0){
        printf("%d ",i);
    }
}
}
