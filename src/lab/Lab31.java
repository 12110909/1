package lab;

import java.util.Scanner;

public class Lab31 {
    public static void main(String []args){
        float width,height,area,perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width");
        width = input.nextFloat();
        System.out.print("Enter the height");
        height = input.nextFloat();
        area = width*height;
        perimeter = width+width+height+height;

        System.out.printf("The area is %.2f\n",area);
        System.out.printf("The perimeter is %.2f",perimeter);
    }
}
