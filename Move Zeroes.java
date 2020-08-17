import java.util.*;
public class Main {
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]!=0 && nums[j]!=0){
                i=j+1;
                j=i+1;
            }
            else if(nums[i]==0 && nums[j]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
            }
            else if(nums[i]!=0){
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
        }
        
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array1[]=new int[n];
        for(int i=0;i<n;i++){
            array1[i]=s.nextInt();
        }
        moveZeroes(array1);
        for(int i=0;i<n;i++){
            System.out.print(array1[i]+" ");
        }
    }
}