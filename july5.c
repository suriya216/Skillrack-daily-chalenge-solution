#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
char n[101];
scanf("%[^\n]s",&n);
int sum1=0,sum2=0,i=0,f=0;
for(i=0;i<strlen(n);i++){
        if(isdigit(n[i])){
            if(n[i]%2==1){
                sum1+=n[i]-'0';
            }
            else{
                sum2+=n[i]-'0';
            }
        }else{
            f=1;
        }
    }
    if(f){
    	printf("Invalid");
	}else
    printf("%d",sum1);
}
