#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a,b,c,d;
    scanf("%d %d %d %d",&a, &b, &c, &d);
    if(a+b==c+d || a+c==b+d || a+d==b+c || a+b+c==d || b+c+d==a || a+c+d==b || a+b+d==c){
        printf("YES");
    }else{
        printf("NO");
    }
}
