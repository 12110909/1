package ass3;

import java.io.*;
import java.util.*;

public class Main {
    static HashMap<String,Integer>stmMap = new HashMap<>();
    static long L;static int n;static long I;static long match;
    static ArrayList<String>STM = new ArrayList<>();
    static ArrayList<String>TB = new ArrayList<>();
    static boolean hasN=false;
    static MaxHeap heap1 = new MaxHeap();static MinHeap heap2 = new MinHeap();
    public static void main(String[] args) {
        long a=0;long b=0;long m=0;int type;String stm;String tb;
        int k;int score;
        QReader in = new QReader();
        QWriter out = new QWriter();
        n=in.nextInt();I= in.nextInt();
        for (int i = 0; i < n; i++) {
            m=m+ in.nextInt();
        }
        for (int i = 3; i < n+3; i++) {
            type = in.nextInt();
            switch (type) {
                case 1: {
                    stm = in.next();
                    STM.add(stm);
                    k = stm.length();
                    if (stmMap.containsKey(stm)) {
                        stmMap.put(stm, stmMap.get(stm) + 1);
                    } else {
                        stmMap.put(stm, 1);
                    }
                    if (heap1.size() == 0 || heap1.getMax() > k) {
                        heap1.push(k);
                        if (heap1.size() > heap2.size()+1) {
                            heap2.push(heap1.getMax());
                            heap1.pop();
                        }
                    } else {
                        heap2.push(k);
                        if (heap1.size() < heap2.size()) {
                            heap1.push(heap2.getMin());
                            heap2.pop();
                        }
                    }
                    L = heap1.getMax();
                    break;
                }
                case 2: {
                    tb = in.next();
                    TB.add(tb);
                    if (stmMap.containsKey(tb)) {
                        match = match + stmMap.get(tb);
                    }
                    I = I + 1;
                    if (STM.size() == 0) {
                        L = 0;
                    }
                    else {
                        if (I < L) {
                            I = I - STM.size();
                            if (I <0) {
                                hasN = true;
                            }
                        }
                    }
                    out.println(L);
                    a = a + L;
                    break;
                }
                case 3: {
                    out.println(match);
                    b = b + match;
                    break;
                }
            }
        }
        score=Long.signum(a)*Long.signum(b)*Long.signum(m);
        if (score<0){
            out.println("Fail");
        }
        else {
            if (!hasN){
                out.println("Qi Fei");
            }
            else out.println("Fail");
        }
        out.close();
    }
}



class QReader {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer tokenizer = new StringTokenizer("");

    private String innerNextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    public boolean hasNext() {
        while (!tokenizer.hasMoreTokens()) {
            String nextLine = innerNextLine();
            if (nextLine == null) {
                return false;
            }
            tokenizer = new StringTokenizer(nextLine);
        }
        return true;
    }

    public String nextLine() {
        tokenizer = new StringTokenizer("");
        return innerNextLine();
    }

    public String next() {
        hasNext();
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
}

class QWriter implements Closeable {
    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public void print(Object object) {
        try {
            writer.write(object.toString());
        } catch (IOException e) {
            return;
        }
    }

    public void println(Object object) {
        try {
            writer.write(object.toString());
            writer.write("\n");
        } catch (IOException e) {
            return;
        }
    }

    @Override
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            return;
        }
    }
}

class MinHeap{
    private static final int MAXSIZE = 10010;
    private int[] a = new int[MAXSIZE];
    private void swap(int x,int y){
        a[x] = a[x]^a[y];
        a[y] = a[y]^a[x];
        a[x] = a[x]^a[y];
    }
    private void up(){
        int p = a[0];
        while(p > 1){
            if (a[p] < a[p/2]){
                swap(p,p/2);
                p = p / 2;
            }
            else
                break;
        }
    }

    public void push(int k){
        a[++a[0]] = k;
        up();
    }
    public void pop(){
        int s = 2, t = 1;
        a[1] = a[a[0]--];
        while (s <= a[0]){
            if (s <= a[0] - 1 && a[s+1] < a[s])
                ++s;
            if (a[s] < a[t]){
                swap(s, t);
                t = s;
                s*=2;
            }
            else
                break;
        }
    }
    public int getMin(){
        return a[1];
    }
    public int size(){
        return a[0];
    }
}

class MaxHeap{
    private static final int MAXSIZE = 10010;
    private int[] a = new int[MAXSIZE];
    private void swap(int x,int y){
        a[x] = a[x]^a[y];
        a[y] = a[y]^a[x];
        a[x] = a[x]^a[y];
    }
    private void up(){
        int p = a[0];
        while(p > 1){
            if (a[p] > a[p/2]){
                swap(p,p/2);
                p = p / 2;
            }
            else
                break;
        }
    }

    public void push(int k){
        a[++a[0]] = k;
        up();
    }
    public void pop(){
        int s = 2, t = 1;
        a[1] = a[a[0]--];
        while (s <= a[0]){
            if (s <= a[0] - 1 && a[s+1] > a[s])
                ++s;
            if (a[s] > a[t]){
                swap(s,t);
                t = s;
                s*=2;
            }
            else
                break;
        }
    }
    public int getMax(){
        return a[1];
    }
    public int size(){
        return a[0];
    }
}
