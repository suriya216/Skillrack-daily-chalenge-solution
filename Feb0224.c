ULL concatenateDigitsWithTrailingZeros(int arr[], int N){
    long long int res=0;
    int j=0;
    for(int i=0;i<N;i++){
        if(arr[i]!=0){
            res=res*10+arr[i];
        }
        else{
            j++;
        }
    }
    return res*pow(10,j);
}
