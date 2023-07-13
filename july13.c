#include<stdio.h>
int main(){
	int x,y;
	scanf("%d %d",&x,&y);
	int i=0;
	for(i=x;i<=y;i++){
		if((i%10+((i%100))/10)%2==0){
			printf("%d ",i);
		}
	}
}
