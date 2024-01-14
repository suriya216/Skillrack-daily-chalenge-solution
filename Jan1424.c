for(int i=0;i<N;i++){
    int count=0,temp=arr[i];
    if(temp==0){
        count++;
    }
    while(temp!=0){
        count++;
        temp/=10;
    }
    arr[i]=arr[i]/10*10+count;
}
