import java.util.*;
public class Main {
    public static int len(int n){
        int l=0;
        while(n>0){
            l++;
            n=n/10;
        }
        return l;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int l=len(n);
        int sum=0;
        while(n>0){
            int k=n%10;
            n=n/10;
            sum+=Math.pow(k,l);
        }
        if(sum==temp){
             System.out.println(true);
        }
        else{
             System.out.println(false);
        }
       
    }
}