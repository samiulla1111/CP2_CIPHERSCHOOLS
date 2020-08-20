class Solution {
    public int num(int n,int a[]){
         if(n==0){
           return 0;
         }
        if(a[n]!=-1){
            return a[n];
        }
        int min=n;
        for(int i=1;i<n;i++){
            if(n-i*i>=0){
                min=Math.min(min,1+num(n-i*i,a));
            }
            else{
                break;
            }
            
        }
        a[n]=min;
        return a[n];
       
        
    }
    public int numSquares(int n) {
        int a[]=new int[n+1];
        
        
        for(int i=1;i<=n;i++){
            a[i]=-1;
        }
        return num(n,a);
      
    }
}