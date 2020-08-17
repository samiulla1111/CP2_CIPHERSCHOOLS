import java.util.*;
public class Main {
    public static int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int p=map.get(nums[i]);
                map.put(nums[i],p+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        int val=0;
        for(int i=0;i<n;i++){
            int p=map.get(nums[i]);
            if(p>max){
                max=p;
                val=nums[i];
            }
        }
        return val;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array1[]=new int[n];
        for(int i=0;i<n;i++){
            array1[i]=s.nextInt();
        }
        int val=majorityElement(array1);
        System.out.println(val);
    }
}