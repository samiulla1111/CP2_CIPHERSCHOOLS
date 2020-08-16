import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array1[]=new int[n];
        int m=s.nextInt();
        int array2[]=new int[n];
        for(int i=0;i<n;i++){
            array1[i]=s.nextInt();
        }

        for(int i=0;i<m;i++){
            array2[i]=s.nextInt();
        }
        if(m>n){
            int temp[]=array1;
            array1=array2;
            array2=temp;
            int t=n;
            n=m;
            m=t;
        }
        int sum[]=new int[Math.max(n,m)+1];
        int carry=0;
        int i=n-1;
        int j=m-1;
        int k=n;
        while(i>=0 && j>=0){
            int val=array1[i]+array2[j]+carry;
            sum[k]=val%10;
            carry=val/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int val=array1[i]+carry;
             sum[k]=val%10;
             carry=val/10;
             i--;
             k--;
        }

        sum[k]=carry;
        int value=0;
        int y=0;
        for(int x=n;x>=0;x--){
            value+=sum[x]*Math.pow(10,y);
            y++;
        }
        System.out.println(value);

    }
}