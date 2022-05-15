package ass1;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            int f = input.nextInt();
            int h,m,s,ss1,ss2,q;
            ss1=a*3600+b*60+c;ss2=d*3600+e*60+f;

            if (a<0|a>=24|b<0|b>=60|c<0|c>=60|d<0|d>=24|e<0|e>=60|f<0|f>=60|ss1>ss2){
                System.out.print("Not valid");
            }
            else {
                q = ss2 - ss1;
                h = q / 3600;
                m = (q - h * 3600) / 60;
                s = q - (h * 3600) - (m * 60);
                if (h != 0) {
                    if (m != 0) {
                        if (s != 0) {
                            System.out.printf("%dh%dm%ds", h, m, s);
                        } else {
                            System.out.printf("%dh%dm", h, m);
                        }
                    } else {
                        if (s != 0) {
                            System.out.printf("%dh%ds", h, s);
                        } else {
                            System.out.printf("%dh", h);
                        }
                    }

                } else if (m != 0) {
                    if (s != 0) {
                        System.out.printf("%dm%ds", m, s);
                    } else {
                        System.out.printf("%dm", m);
                    }
                } else {
                    System.out.printf("%ds", s);
                }
            }
        }
        catch(Exception e){
            System.out.print("Not valid");
        }
    }
}


