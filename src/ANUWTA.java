import java.io.*;

public class ANUWTA {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){

            long n = Long.parseLong(br.readLine());

            long res = 0;
            res = ((n*(n+1))/2) + n;
            System.out.println(res);

        }
    }
}
