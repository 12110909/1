package ass2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long R = input.nextLong(), count = 0;
        double f=0;
        double e = R/1.414213562373095048801688;
        for (long i = 1; i < e; i++) {
            f = Math.sqrt(R*R-i*i);
            if (f==Math.floor(f)){
                count++;
            }
        }
        if (R != 0) {
            count = count * 8 + 4;
            System.out.println(count);
        }
        else {
            System.out.println("1");
        }
    }
}
