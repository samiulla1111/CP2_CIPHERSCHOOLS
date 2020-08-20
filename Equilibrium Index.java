public class Main {
    public static void main(String[] args) 
    { 
        int sum = 0; 
        int leftsum = 0;
        int n=7;
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
        for (int i = 0; i < n; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i];  
  
            if (leftsum == sum){
                 System.out.println(i); 
                 return;
            }
               
  
            leftsum += arr[i]; 
        } 
    } 
}