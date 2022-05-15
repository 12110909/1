package ass2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String p = input.nextLine();
        String[]a = new String[T];
        String[]b;
        char[]c = new char[8];
        char[]d = new char[8];
        int kk;boolean out;

      for (int i=0 ; i<T ; i++) {
            a[i] = input.nextLine();
        }

         for (int j =0 ; j<T ; j++) {
            kk=0;out = false;
            b = a[j].split(" ");
            for (int k =0; k<8; k++){
                    c[k]=b[k].charAt(0);
                    d[k]=b[k].charAt(1);
            }
             if (roc(c)||roc(d)){
                System.out.println("No");
                continue;
            }
            while (kk<7){
                String[]y=t(c[kk],d[kk]);
                int u=y.length;
                for (int o =0 ; o<8 ; o++){
                    if (cr(y, b[o], u)) {
                        out = true;
                        break;
                    }
                }
                kk=kk+1;


            }
            if (out){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }


    }


    public static boolean roc(char[]e){
        boolean w=false;
        for (int i =0 ;i<8;i++){
            int r=0;
            for (int j =0;j<8;j++){
                if (e[i]==e[j]){
                    r=r+1;
                }
           }
            if (r!=1){
                w=true;
                break;
            }
        }
        return w;
    }


    public static boolean cr(String[]a,String b,int u){
        boolean q = false;
        for (int i=0;i<u;i++){
            if (b.equals(a[i])){
                q = true;
                break;
            }
        }
        return q;
    }


    public static String[]t(char a ,char b ){
        char c,d;
        List<String>cross=new ArrayList<>();
        for(int i =1;i<8;i++){
            c=(char) (a-i);
            d=(char) (b-i);
            if (c<97|c>104|d<49|d>56){
                break;
            }
            else {
                String s = String.valueOf(c) +String.valueOf(d);
                cross.add(s);
            }
        }
        for(int i =1;i<8;i++){
            c=(char) (a+i);
            d=(char) (b-i);
            if (c<97|c>104|d<49|d>56){
                break;
            }
            else {
                String s = String.valueOf(c) +String.valueOf(d);
                cross.add(s);
            }
        }
        for(int i =1;i<8;i++){
            c=(char) (a-i);
            d=(char) (b+i);
            if (c<97|c>104|d<49|d>56){
                break;
            }
            else {
                String s = String.valueOf(c) +String.valueOf(d);
                cross.add(s);
            }
        }
        for(int i =1;i<8;i++){
            c=(char) (a+i);
            d=(char) (b+i);
            if (c<97|c>104|d<49|d>56){
                break;
            }
            else {
                String s = String.valueOf(c) +String.valueOf(d);
                cross.add(s);
            }
        }
        String[] h = cross.toArray(new String[cross.size()]);

        return h;
    }
}
