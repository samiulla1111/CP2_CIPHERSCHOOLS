import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int cows=s.nextInt();
        Arrays.sort(a);
        int high=a[n-1];
        int low=0;
        int mid=0;
        int best=0;
        while(low<=high){
            // System.out.println("outer while");
            int c=1;
            mid=(high+low+1)/2;
            int l=0;
            int h=1;
            // c--;
            while(l<h && h<n && c<cows){
                // System.out.println("inner while");
                if(a[h]-a[l]>=mid){
                    c++;
                    l=h;
                    h=h+1;
                }
                else{
                    h=h+1;
                }
            }
            if(c>=cows){
                best=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.print(best);
    }
}