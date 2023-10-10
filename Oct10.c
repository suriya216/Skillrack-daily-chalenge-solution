#include<stdio.h>
#include<stdlib.h>

int main()
{
    int X,Y,Z;
    scanf("%d %d %d",&X,&Y,&Z);
    int max=((X>Y)?X:Y)>Z?((X>Y)?X:Y):Z;
    int sum=0;
    sum+=(max-X)+(max-Y)+(max-Z);
    printf("%d",sum);
}
