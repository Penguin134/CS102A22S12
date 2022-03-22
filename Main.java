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