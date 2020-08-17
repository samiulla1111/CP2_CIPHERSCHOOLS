import java.util.*;
public class Main {
    public static void rotateArray(int arr[],int s,int end){
        int i=s;
        int j=end;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        if(k==0){
           return;
        }
        k=k%nums.length;
        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array1[]=new int[n];
        for(int i=0;i<n;i++){
            array1[i]=s.nextInt();
        }
        int k=s.nextInt();
        rotate(array1,k);
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}