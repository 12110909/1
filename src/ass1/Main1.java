package ass1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        double b = input.nextDouble();
        String c = input.next(), d = "Y", e = "N";
        boolean f = false, g = false, h = false;
        if (a >= 10000000 && a <= 999999999) {
            f = true;
        }
        if (b > 35.0 && b < 45.0) {
            g = true;
        }
        if (c.equals(d) | c.equals(e)) {
            h = true;
        }
        if (f && g && h) {
            System.out.print("Submit successfully");
        }
        else {
            System.out.print("Error in ");
            if (!f) {
                System.out.print("Student ID");
                if (!g) {
                    System.out.print(" and Temperature");
                    if (!h) {
                        System.out.print(" and Nucleic Acid PCR test");
                    }
                }
                else if (!h){
                    System.out.print(" and Nucleic Acid PCR test");
                }
            }
            else if (!g) {
                System.out.print("Temperature");
                if (!h) {
                    System.out.print(" and Nucleic Acid PCR test");
                }

            }
            else System.out.print("Nucleic Acid PCR test");
        }
    }
}