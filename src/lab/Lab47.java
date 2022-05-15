package lab;

import java.util.Scanner;

public class Lab47 {
    public static void main(String[] args) {
        int a =1;
        while (a!=0){
            System.out.print("Please input a number to print the Multiplication Table [0 to terminate]\n");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            switch(a){
                case 1:
                    System.out.print(" 1 * 1 = 1\n");
                    break;
                case 2:
                    System.out.print(" 1 * 1 = 1\n");
                    System.out.print(" 1 * 2 = 2  2 * 2 = 4\n");
                    break;
                case 3:
                    System.out.print(" 1 * 1 = 1\n");
                    System.out.print(" 1 * 2 = 2  2 * 2 = 4\n");
                    System.out.print(" 1 * 3 = 3  2 * 3 = 6  3 * 3 = 9\n");
                    break;
                case 4:
                    System.out.print(" 1 * 1 = 1\n");
                    System.out.print(" 1 * 2 = 2  2 * 2 = 4\n");
                    System.out.print(" 1 * 3 = 3  2 * 3 = 6  3 * 3 = 9\n");
                    System.out.print(" 1 * 4 = 4  2 * 4 = 8  3 * 4 = 12 4 * 4 = 16\n");
                case 5:
                    System.out.print(" 1 * 1 = 1\n");
                    System.out.print(" 1 * 2 = 2  2 * 2 = 4\n");
                    System.out.print(" 1 * 3 = 3  2 * 3 = 6  3 * 3 = 9\n");
                    System.out.print(" 1 * 4 = 4  2 * 4 = 8  3 * 4 = 12 4 * 4 = 16\n");
                    System.out.print(" 1 * 5 = 5  2 * 5 = 10 3 * 5 = 15 4 * 5 = 20 5 * 5 =25\n");


            }

        }
    }
}
