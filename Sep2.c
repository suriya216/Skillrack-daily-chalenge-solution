#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str1[101],str2[101];
    scanf("%s%s",str1,str2);
    int len1=strlen(str1), len2=strlen(str2);
    if(len1<len2){
        for(int i=0;i<len2;i++){
            if(i<len1){
                printf("%c",str1[i]);
            }else{
                printf("*");
            }
        }
        printf("\n%s",str2);
    }
    else{
        printf("%s\n",str1);
        for(int i=0;i<len1;i++){
            if(i<len1-len2){
                printf("*");
            }else{
                printf("%s",str2);
                break;
            }
        }
    }
}
