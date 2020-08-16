import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mid=n/2;
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=mid+1;j++){
                if(j==1||j==mid+1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            if(i==1){
                for(int j=1;j<=mid;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        for(int i=mid+1;i<n;i++){
            if(i==n-1){
                for(int j=1;j<=mid;j++){
                    System.out.print("* ");
                }

                for(int j=mid+1;j<=n;j++){
                    if(j==mid+1 || j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            else{
                for(int j=1;j<=n;j++){
               
                    if(j==mid+1 || j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }

                    
                }

            }
            
            System.out.println();
        }

             
            
      
    }
}