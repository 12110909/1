package ass2;

import java.util.Scanner;
public class s {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        long r = input.nextLong();
        double max = (int)(r / 1.414);
        int count = 0;
        for (long i = 1; i < max; i++) //如果不行看看=
        {
            double delta = Math.sqrt(r * r - i * i);
            if ((int) delta == delta) {
                count += 1;
                //System.out.println(i);
            }
        }
        int num = 8 * count + 4;
        if(r!=0)
            System.out.println(num);
        else
            System.out.println(1);
    }
}