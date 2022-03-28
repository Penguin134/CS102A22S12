//Java Fast IO

import java.io.*;
import java.util.*;

/**
 * @author lowbieh : https://paste.ubuntu.com/p/6ybMcVXvz5/
 */
class Main {

    // You can declare variable and method here
    private static String[] stm = new String[1000];
    public static void alterInfluenceGauge(int k){}

    public static void main(String[] args) {

        // TODO: Please write your code here

        /* To help you get used to it
         * Following code are some examples in the usage of Java Fast IO
         */

        /* Use the following code to replace
         * Scanner in = new Scanner();
         * */
        QReader in = new QReader();
        QWriter out = new QWriter();

        // To read until there is no input
        while (in.hasNext()) {
            // Read an integer
            int x = in.nextInt();
            // Read a long
            long l = in.nextLong();
            // Read a line
            stm[0] = in.nextLine();
            // Read a String
            stm[1] = in.next();

            /* Use the following code to replace
             * System.out.println(x);
             * */
            out.println(x);
            /* Use the following code to replace
             * System.out.print(l);
             * */
            out.print(l);
            /* Object 'out' does not have a method called printf()
             * So, the following usage is wrong:
             * out.printf("%d\n",x);
             * */
        }

        // This should be at the last of main()
        out.close();
    }
}

// Don't make any change in the following code
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

/**
 * MaxHeap & MinHeap class may help you find the median
 * To correctly use them, you should first instantiate the object
 * and then use the public methods in it.
 */
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
        if (a[0] == 0){
            System.err.println("Cannot execute pop operation, size should be at least 1");
            return;
        }
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
    public int getMax(){
        return a[1];
    }
    public int size(){
        return a[0];
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
        if (a[0] == 0){
            System.err.println("Cannot execute pop operation, size should be at least 1");
            return;
        }
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
    public int getMin(){
        return a[1];
    }
    public int size(){
        return a[0];
    }
}
