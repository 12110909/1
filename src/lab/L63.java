package lab;

import java.util.Scanner;

public class L63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a=0,b=1,c=0;
        n=n-1;
        while (n>0){
            c=a+b;
            a=b;
            b=c;
            n=n-1;
        }
        System.out.printf("%d",c);
    }
}