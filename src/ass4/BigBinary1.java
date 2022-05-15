package ass4;
/*
public class BigBinary {
    int[] bits;
    boolean positive;

    public BigBinary(int[] bits, boolean positive) {
        this.positive = positive;
        int[] bit = new int[bits.length - fuckZero(bits)];
        System.arraycopy(bits, fuckZero(bits), bit, 0, bits.length - fuckZero(bits));
        this.bits = bit;
    }

    public static int fuckZero(int[] bits) {
        int count = 0;
        for (int bit : bits) {
            if (bit != 1) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public String toString(){
        StringBuilder str= new StringBuilder();
        for (int bit : bits) {
            str.append(bit);
        }
        if (!positive){
            str.insert(0,"-");
        }
        return str.toString();
    }

    public static int compare(int[]b1,int[]b2){
        if (b1.length>b2.length){
            return 1;
        }
        else if (b1.length<b2.length){
            return -1;
        }
        else {
            for (int i = 0; i < b1.length; i++) {
                if (b1[i]>b2[i]){
                    return 1;
                }
                else if (b1[i]<b2[i]){
                    return -1;
                }
            }
            return 0;
        }
    }

    public BigBinary add(BigBinary bigBinary){

    }

    public  static BigBinary add(BigBinary b1, BigBinary b2){
        int[]a1=b1.bits;int[]a2= b2.bits;
        int length=Math.max(a1.length,a2.length); int count=0;
        int[] answer=new int[length+1]; boolean pp;
        if (b1.positive == b2.positive){
            for (int i = 0; i < length; i++) {
                if (a1.length>i){
                    count=count+a1[a1.length-i-1];
                }
                if (a2.length>i){
                    count=count+a2[a2.length-i-1];
                }
                answer[answer.length-i-1]=count&1;
                count>>=2;
            }
            answer[0]=count;
            int[]out=new int[answer.length-fuckZero(answer)];
            System.arraycopy(answer, fuckZero(answer), out, 0, answer.length - fuckZero(answer));
            return new BigBinary(out, b1.positive);
        }
        else {
            switch (compare(a1,a2)){
                case 1:{
                    pp=b1.positive;
                    a2=fanle(a2);
                }
                case 0:{
                    int[]out=new int[]{0};pp=true;
                    return new BigBinary(out,pp);
                }
            }
        }
    }

    public BigBinary minus(BigBinary bigBinary){

    }

    public static BigBinary minus(BigBinary b1, BigBinary b2){

    }

    public static int[] fanle(int[]bits){
        int[]a=new int[bits.length];int c1=0,c2=0;
        for (int i = bits.length-1; i >-1; i--) {
            if (bits[i]!='1'){
                c1++;
            }
            if (c1!=0){
                if (c2==0){
                    a[i]=bits[i];
                    c2++;
                }
                else {
                    if (bits[i]==1){
                        a[i]=0;
                    }
                    else a[i]=1;
                }
            }
            else a[i]=bits[i];
        }
        int[]out=new int[a.length-fuckZero(a)];
        System.arraycopy(a,fuckZero(a),out,0,a.length-fuckZero(a));
        return out;
    }
}
*/