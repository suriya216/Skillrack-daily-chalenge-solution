#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a=n,b=1;
    for(int i=0;i<a/2;i++){
        for(int j=0;j<b;j++){
            printf("%d",b);
        }
        for(int k=0;k<n;k++){
            printf("%d",n);
        }
        b++;
        n--;
        printf("\n");
    }
}
