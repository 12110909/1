package ass2;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); String p1 = input.nextLine();
        String S = input.nextLine(); String D = input.nextLine();
        String[]s = S.split(" "); String[]d = D.split(" ");
        int max=0,cha;

        int[]sq = new int[s.length]; int[]dq = new int[d.length];
        for (int i=0 ; i < s.length ; i++){
            sq[i] = Integer.parseInt(s[i]);
        }
        for (int i=0 ; i < d.length ; i++){
            dq[i] = Integer.parseInt(d[i]);
        }
        Arrays.sort(sq);Arrays.sort(dq);

        for (int i = 0 ; i<N ; i++ ){
            cha = Math.abs(sq[i]-dq[i]);
            if (max<cha){
                max=cha;
            }
        }
        System.out.println(max);
    }
}
