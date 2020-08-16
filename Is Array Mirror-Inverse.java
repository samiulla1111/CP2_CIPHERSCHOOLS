import java.util.*;
public class Main {
    public static boolean find(int a[],int n){
        if(n%2!=0){
            int mid=n/2+1;
            if(a[mid-1]!=mid-1){
                return false;
            }
            for(int i=0;i<mid-1;i++){
                if(a[i]!=i+mid){
                    return false;
                }
            }

            for(int i=mid;i<n;i++){
                 if(a[i]!=i-mid){
                    return false;
                }
            }
            return true;
        }
        else{
            int mid=n/2;
           
            for(int i=0;i<mid-1;i++){
                if(a[i]!=i+mid){
                    return false;
                }
            }

            for(int i=mid;i<n;i++){
                 if(a[i]!=i-mid){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array1[]=new int[n];
        for(int i=0;i<n;i++){
            array1[i]=s.nextInt();
        }

        boolean val=find(array1,array1.length);
        System.out.println(val);

    }
}