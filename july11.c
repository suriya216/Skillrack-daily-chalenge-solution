#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int u,t,h;
    u=n%10;
    t=(n%100)/10;
    h=(n%1000)/100;
    if(u>t&&u>h)
	printf("%d",u);
    else if(t>h&&t>u)
	printf("%d",t);
    else
	printf("%d",h);
}