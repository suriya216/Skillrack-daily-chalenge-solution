   int t=N;
    int max=0, smax=0;
    while(t!=0){
        int l=t%10;
        if(l>max){
            smax=max;
            max=l;
        }
        if(smax<l && l!=max){
            smax=l;
        }
        t/=10;
    }
   return smax;
