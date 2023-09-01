#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[n],m=0;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        if(m<arr[i]){
            m=arr[i];
        }
    }
    while(m!=0){
        for(int j=0;j<n;j++){
            if(arr[j]==m){
                printf("# ");
                arr[j]--;
            }else{
                printf("- ");
            }
        }
        m--;
        printf("\n");
    }

    return 0;
}
