    int count=0;
    int *res=(int*)malloc(N*sizeof(N));
    for(int i=0;i<N;i++){
        count=0;
        for(int j=i+1;j<N;j++){
            if(arr[j]<arr[i]){
                count++;
            }
        }
        res[i]=count;
    }
    return res;
