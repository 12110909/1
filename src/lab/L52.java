package lab;

import java.util.Scanner;

public class L52 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int size = input.nextInt(),i=0;
        input.nextLine();
        System.out.printf("Enter the 1st integer array of size %d :",size);
        String L1 = input.nextLine();
        System.out.printf("Enter the 2nd integer array of size %d :",size);
        String L2 = input.nextLine();
        String[] s1 = L1.split(" ");String[] s2 = L2.split(" ");
        while (i<size){
            if (s1[i].equals(s2[i])){
                i++;
            }
            else {
                System.out.print("The two arrays have different values");
                break;
            }
        }
        if (i==size){
            System.out.print("The two arrays have the same value");
        }
    }
}
