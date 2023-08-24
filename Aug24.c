#include<stdio.h>
int main(){
  int x1,x2,y1,y2;
  scanf("%d %d\n%d %d",&x1,&x2,&y1,&y2);
  double p=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
  double a=3.1428571428571*p*p;
  printf("%.2lf",a);
}
