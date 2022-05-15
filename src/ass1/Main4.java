package ass1;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String L= input.nextLine();
        if (L.length()!=31){
            System.out.print("Not valid");
        }
        else {
            char l1=L.charAt(7),l2=L.charAt(15),l3=L.charAt(23);
            if (l1!=32|l2!=32|l3!=32) {
                System.out.print("Not valid");
            }
            else {
                String a = L.substring(0, 7), b = L.substring(8, 15), c = L.substring(16, 23), d = L.substring(24);
                int count1, count2, count3 = 0, M = 0, mark = 100, i, q = 10,count4=0;
                String y = "Y", n = "N";
                String[] Str = {a, b, c, d};
                while (M < 4) {
                  count1 = 0;
                  count2 = 0;
                  count4 = 0;
                  i = 0;
                    while (i < 7) {
                      String e = Str[M].substring(i, i + 1);
                      if (e.equals(y)) {
                        count1 = count1 + 1;
                        count4 = 0;
                      } else if (e.equals(n)) {
                        count2 = count2 + 1;
                        count4 = count4+1;
                      } else {
                        System.out.print("Not valid");
                        return;
                      }
                      i = i + 1;
                      if (count4==3){
                          count3=count3+1;
                          break;
                      }
                      if (count2 == 4) {
                        count3 = count3 + 1;
                        break;
                      }
                    }
                  M = M + 1;
                }
                while (count3 > 0) {
                  mark = mark - q;
                  q = q + 5;
                  count3 = count3 - 1;
                }
                System.out.printf("%d", mark);
            }
        }
    }
}