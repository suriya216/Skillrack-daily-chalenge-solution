for(int i=R-1;i>=R/2;i--){
        for(int j=0;j<C;j++){
            int t=matrix[i][j];
            matrix[i][j]=matrix[R-i-1][j];
            matrix[R-i-1][j]=t;
        }
    }
