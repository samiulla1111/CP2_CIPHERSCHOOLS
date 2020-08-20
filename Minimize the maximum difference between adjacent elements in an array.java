public class Main {
    public static int minimumAdjacentDifference(int a[],   int n, int k)  
    {  
        int minDiff = Integer.MAX_VALUE;  
      
        for (int i = 0; i <= k; i++) {  
           
            int maxDiff = Integer.MIN_VALUE;  
            for (int j = 0; j < n - k - 1; j++) {  
                for (int p = i; p <= i + j; p++) {  
                    maxDiff = Math.max(maxDiff,  
                        a[p + 1] - a[p]);  
                }  
            } 
   
          
            minDiff = Math.min(minDiff, maxDiff);  
        }  
        return minDiff;  
    }  
    public static void main(String args[]) {
       int n = 5;  
        int k = 2;  
      
        int []a = { 3, 7, 8, 10, 14 };  
      
        System.out.println(minimumAdjacentDifference(a, n, k));
    }
}