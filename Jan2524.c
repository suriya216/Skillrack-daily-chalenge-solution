    int count=0;
    int t=N;
    while(t!=0){
        count++;
        t/=10;
    }
    char arr[count];
    sprintf(arr,"%d",N);
    char sd[count];
    for(int i=0;i<strlen(arr)-1;i+=2){
        sd[i]=arr[i+1];
        sd[i+1]=arr[i];
    }
    if(strlen(arr)%2==1){
        sd[strlen(arr)-1]=arr[strlen(arr)-1];
    }
    return atoi(sd);
    
