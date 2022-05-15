package ass2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = (n+1)*3;
        System.out.printf("%d\n",q);
        for(int i = 1; i<n+2;i++){
            System.out.printf("%d %d\n",i,i);
            if (i>0&&i<n+2){
                System.out.printf("%d %d\n",i-1,i);
                System.out.printf("%d %d\n",i,i-1);
            }
        }
    }
}
