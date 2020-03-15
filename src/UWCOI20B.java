import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UWCOI20B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(s[i]);
            }

            long count_eve = 0;
            long count_odd = 0;

            /*// Pick all elements one by one
            for (int i = 0; i < n; i++)
            {
                // See if there is a pair
                // of this picked element
                for (int j = i + 1; j < n; j++)
                    if ( (arr[i] + arr[j])%2 != 0 || (arr[j] + arr[i])%2 != 0)
                        count++;
            }*/

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    count_eve++;
                } else {
                    count_odd++;
                }
            }

            if (count_eve == 0 || count_odd == 0) {
                System.out.println(0);
            } else {
                System.out.println(count_eve*count_odd);
            }

        }
    }
}
