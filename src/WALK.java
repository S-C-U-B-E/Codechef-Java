import java.io.*;
import java.util.*;

public class WALK {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-- >0) {

            int n = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split(" ");
            Integer[] ar = new Integer[temp.length];
            for (int i = 0; i < temp.length; i++) {
                ar[i] = Integer.parseInt(temp[i])+i;
            }
            System.out.println(Collections.max(Arrays.asList(ar)));

        }
    }
}
