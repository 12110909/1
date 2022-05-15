package lab;

import java.util.Scanner;

public class Lab32 {
    public static void main(String []args){
        int a,b,c,d;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: " );
        a = input.nextInt();

        b = a/3600;
        c = (a-b*3600)/60;
        d = (a-b*3600-c*60);

        System.out.printf("The equivalent time is %d",b);
        System.out.printf(" hours %d",c);
        System.out.printf(" minutes and %d",d);
        System.out.print(" seconds");
    }
}
