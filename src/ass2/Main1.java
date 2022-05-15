package ass2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String l1 = input.nextLine();
        String l2 = input.nextLine();
        String l3 = input.nextLine();

        int n = Integer.parseInt(l1);
        String[]la=l2.split(" ");
        double[]a = new double[n];
        for (int i=0;i < la.length;i++){
            a[i] = Double.parseDouble(la[i]);
        }

        String[]lb = l3.split(" ");
        double l =Double.parseDouble(lb[0]);
        double r =Double.parseDouble(lb[1]);

        for (int j=0;j < la.length;j++){
            String q =Chu(a[j],j+1);
            a[j] = Double.parseDouble(q);
        }

        double out;
        out = He(a,r)-He(a,l);
        System.out.println(out);
    }

    public static String Chu(double a,double b){
        DecimalFormat dF = new DecimalFormat("0.000000000000000");
        return dF.format( a/b);
    }

    public static double He(double[]array,double x){
        double sum=0;
        for (int i=0;i< array.length;i++){
            sum = array[i] * Math.pow(x,i+1)+sum;
        }
        return sum;
    }
}
