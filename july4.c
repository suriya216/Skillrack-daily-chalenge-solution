#include<stdio.h>
int main(){
	char str[100];
	int X;
	scanf("%s\n%d",str,&X);
	str[X]='\0';
	printf("%s",str);	
}
