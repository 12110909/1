package ass1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        String b = input.next();
        String c = "Y", d = "N";
        int length = b.length();
        int count1=0,count2=0;
        int i = 0;

        if ((a < 10000000 | a > 99999999 | length != 7)) {
            System.out.print("Not valid");
        }
        else {
            while (i<7){
                String e = b.substring(i,i+1);
                if (e.equals(c)|e.equals(d)){
                    if (e.equals(c)){
                        count1=count1+1;
                    }
                    else {
                        count2=count2+1;
                    }
                }
                else {
                    System.out.print("Not valid");
                    break;
                }
                i=i+1;
                if (count2==3){
                    System.out.print("Has not participated in Nucleic Acid PCR tests as required!");
                    break;
                }
            }
            if (i==7) {
                if (count1 <= 3) {
                    System.out.print("Has not participated in Nucleic Acid PCR tests as required!");
                } else {
                    System.out.print("Good, keep it up!");
                }
            }
        }
    }
}
