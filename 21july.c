#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[101];
    scanf("%s",str);
    int i=0;
    for(i=0;i<strlen(str);i++){
        if(i%2!=0){
            printf("*");
        }
        else
            printf("%c",str[i]);
    }
    printf("\n");
    for(i=0;i<strlen(str);i++){
        if(i%2==0)
            printf("*");
        else
            printf("%c",s[i]);
    }
}