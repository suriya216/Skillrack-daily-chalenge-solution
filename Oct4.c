#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[1001];
    scanf("%s",str);
    for(int i=0;i<strlen(str);i++){
        if(isdigit(str[i])){
            printf("%c ",str[i]);
        }
        else{
            printf("%d ",str[i]);
        }
    }
}
