package lab;

import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
         int i = 1;String a,b;

        while (i==1){
            System.out.print("Type a string (\"quit\" to finish):");
            Scanner input = new Scanner(System.in);
            a = input.nextLine();
            if (a.equals("quit")) {
                break;
            }
            b = reverse(a);
            if (a.equals(b)){
                System.out.printf("%s is a palindrome\n",a);
            }
            else {
                System.out.printf("%s is not a palindrome\n",a);
            }

        }
    }
     public static String reverse (String str){
        return  new StringBuilder(str).reverse().toString();
     }

}
