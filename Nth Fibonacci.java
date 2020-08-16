import java.util.*;
public class Main {
     public static int fib(int N) {
        if(N==0||N==1){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fib(n));
    }
}