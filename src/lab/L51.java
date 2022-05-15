package lab;

import java.util.Scanner;

public class L51 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input 10 scores of these students:");
        String L = input.nextLine();
        String[] s = L.split(" ");
        double [] S = new double[10];
        int i=0;
        double h,l,av=0;
        while (i<10){
            S[i]=Double.parseDouble(s[i]);
            av=S[i]+av;
            i++;
        }
        i=2;
        if (S[1]>=S[2]) {
            h=S[1];l=S[2];
        }
        else {
            h=S[2];l=S[1];
        }
        while (i<10){
            if (S[i]>h){
                h=S[i];
            }
            else if (S[i]<l){
                l=S[i];
            }
            i++;
        }
        av=(av-h-l)/8;
        System.out.printf("Average score is %.2f",av);
    }
}
