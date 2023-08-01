#include<stdio.h>
int main(){
  int num;
  scanf("%d",&num);
  int lastdigit=num%10;
  while(num>=10){
    num/=10;
  }
  printf("%d%d",num,lastdigit);
}
