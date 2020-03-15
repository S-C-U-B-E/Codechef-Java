import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Prime_Factors {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        for(int l=1; l<=t; l++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> al = new ArrayList<>();
            while (n % 2 == 0) {
                al.add(2);
                n = n / 2;
            }

            for (int i = 3; i <= sqrt(n); i += 2) {
                while (n % i == 0) {
                    al.add(i);
                    n = n / i;
                }
            }

            if (n > 2)
                al.add(n);

            System.out.println(new HashSet(al));

        }
    }
}
