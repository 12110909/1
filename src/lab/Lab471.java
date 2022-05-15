package lab;

import java.util.Scanner;

public class Lab471 {
    public static void main(String[] args) {
        int j,a;int i=1;
        while (i!=0) {
            i=1;j=1;
            System.out.print("Please input a number to print the Multiplication Table [0 to terminate]\n");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            if (a<0|a>9){
                System.out.print("Please input a number between [1,9]\n");}
            else if (a==0)
                break;
            else{
                while ( i<=a){
                    j=1;
                    while (j<=i){
                        System.out.printf("%d * %d = %-2d ",j,i,j*i);
                        j=j+1;
                    }
                    System.out.println("");
                    i=i+1;
                }
            }
        }
    }
}