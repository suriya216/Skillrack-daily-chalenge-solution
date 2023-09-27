#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

int isvowel(char ch){
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
int isconsonant(char ch){
    return ch=='B'||ch=='C'||ch=='D'||ch=='F'||ch=='G'||ch=='H'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z';
}
int main()
{
    char str[101];
    scanf("%s",str);
    bool printed=false;
    int i=0;
    while(str[i]!='\0'){
        if(!isvowel(str[i]) && !isconsonant(str[i])){
            printf("%c",str[i]);
            printed=true;
        }
        i++;
    }
    if(!printed){
        printf("-1");
    }
}
