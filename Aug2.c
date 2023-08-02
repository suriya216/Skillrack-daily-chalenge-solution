#include<stdio.h>
#include<stdlib.h>

int main()
{
    char c1,c2;
    scanf("%c %c",&c1,&c2);
    char i;
    if(c1<c2){
        for(i=c1;i<=c2;i++){
            if(i!='a' && i!='e' && i!='i' && i!='o' && i!='u'){
                printf("%c ",i);
            }
        }
    }
    else{
        for(i=c1;i>=c2;i--){
            if(i!='a' && i!='e' && i!='i' && i!='o' && i!='u'){
                printf("%c ",i);
            }
        }
    }
}
