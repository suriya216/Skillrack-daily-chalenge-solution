#include<stdio.h>
#include<stdlib.h>

int main()
{
    int X,Y,Z;
    scanf("%d %d %d",&X,&Y,&Z);
    int count=0;
    if(X<1||Y<2||Z<4){
        count=0;
    }
    while(X>0 && Y>0 && Z>0){
        X-=1;
        Y-=2;
        Z-=4;
        if(X<0 || Y<0 || Z<0){
            break;
        }
        count++;
    }
    printf("%d",count);
}
