import java.util.*;
public class Main {

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int p=0;
        while(n>0){
            int temp=n%10;
            n=n/10;
            sum+=Math.pow(2,p)*temp;
            p++;
        }
        System.out.print(sum);
        
    }
}