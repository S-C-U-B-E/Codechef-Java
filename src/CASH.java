import java.io.*;
import java.util.ArrayList;

public class CASH {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            long k = Long.parseLong(temp[1]);

            String[] a2 = br.readLine().split(" ");
            ArrayList<Long> l1 = new ArrayList<>();
            for (int j = 0; j < a2.length; j++) {
                l1.add(Long.parseLong(a2[j]));}

            long s=0;
            for(long i:l1)
                s+=i;

            System.out.println(s%k);
        }
    }
}
