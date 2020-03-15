import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Coders
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int shan = sc.nextInt();
        for (int t=0; t<shan; t++) {
            int lim = sc.nextInt();
            int k = sc.nextInt();
            boolean[] coins = new boolean[lim];
            for (int i=0; i<lim; i++) {
                String cur = sc.next();
                if (cur.equals("H")) {
                    coins[i] = true;
                }
            }
            int num = 0;
            for (int i=0; i<k; i++) {
                boolean cur = coins[lim-1];
                if ((cur && num % 2 == 0) || (!cur && num % 2 != 0)) {
                    num++;
                }
                lim--;
            }
            int count = 0;
            if (num % 2 == 0) {
                for (int i=0; i<lim; i++) {
                    if (coins[i]) {
                        count++;
                    }
                }
            } else {
                for (int i=0; i<lim; i++) {
                    if (!coins[i]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}