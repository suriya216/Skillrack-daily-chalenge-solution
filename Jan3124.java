int even=0, odd=0;
for(int i=0;i<N;i++){
    if(arr[i]%2==0){
        even+=arr[i];
    }else{
        odd+=arr[i];
    }
}
return odd%even;
