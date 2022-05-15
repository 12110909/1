package ass3;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Fence = input.nextLine();
        String Caesar = input.nextLine();
        int N =input.nextInt();
        int M = input.nextInt();
        String out;

        String cipher; String key;

        key=getFence(Fence);
        cipher=getCaesar(Caesar,N);
        out=getAnswer(cipher,key,M);

        System.out.println(out);
    }
    public static String getFence(String cipher) {
        String str;
        StringBuilder out = new StringBuilder();
        int n;

        n = Integer.parseInt(cipher.substring(cipher.length()-1));
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i< cipher.length(); i++){
            if (cipher.charAt(i)>='a'&&cipher.charAt(i)<='z'){
                strBuilder.append((cipher.substring(i, i + 1)).toUpperCase());
            }
            else if (cipher.charAt(i)>='A'&&cipher.charAt(i)<='Z'){
                strBuilder.append(cipher.charAt(i));
            }
        }
        str = strBuilder.toString();

        char[] a =new char[str.length()];

        for (int i= 0;i<str.length() ; i++){
            a[i]=str.charAt(i);
        }
        for (int i = 0;i<n;i++){
            for (int j = i;j<str.length();j=j+n){
                out.append(a[j]);
            }
        }
        return out.toString();
    }
    public static String getCaesar(String cipher,int n) {

         StringBuilder out= new StringBuilder();String in;
         int num;char q;
        StringBuilder inBuilder = new StringBuilder();
        for (int i = 0; i<cipher.length(); i++){
            if (cipher.charAt(i)>='a'&&cipher.charAt(i)<='z'){
                inBuilder.append((cipher.substring(i, i + 1)).toUpperCase());
            }
            else {
                inBuilder.append(cipher.charAt(i));
            }

        }
        in = inBuilder.toString();

        for (int i = 0; i<in.length();i++){
            if (in.charAt(i)>='A'&&in.charAt(i)<='Z'){
                q=in.charAt(i);
                num = (int) q +n;
                while (num>90){
                    num=num-26;
                }
                out.append((char) num);
            }
            else {
                out.append(in.charAt(i));
            }
        }
        return out.toString();
    }
    public static String getAnswer(String cipher,String key,int M) {
        StringBuilder out= new StringBuilder(); char d; int num2;
        int k=0;

        if (M<key.length()) {
            key = key.substring(0, M);
        }

        if (key.length()<cipher.length()){
            int num = key.length()-cipher.length(); StringBuilder newKey= new StringBuilder(key);
            for (int i=key.length();i<cipher.length();i=i+key.length()){
                for (int j=0;j<key.length();j++){
                    newKey.append(key.charAt(j));
                }
            }
            key = newKey.substring(0,cipher.length());
        }

        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i)>='A'&&cipher.charAt(i)<='Z'){
                num2 = cipher.charAt(i)+key.charAt(k)-65;
                if (num2>90){
                    num2=num2-26;
                }
                d = (char) num2;
                out.append(d);
                k=k+1;
            }
            else {
                out.append(cipher.charAt(i));
            }
        }
        return out.toString();
    }
}