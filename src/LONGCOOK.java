import java.io.*;

public class LONGCOOK {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while (l-- > 0) {
            String[] temp = br.readLine().split(" ");
            long m1 = Long.parseLong(temp[0]);
            long y1 = Long.parseLong(temp[1]);

            temp = br.readLine().split(" ");
            long m2 = Long.parseLong(temp[0]);
            long y2 = Long.parseLong(temp[1]);

            if(y2<2020){
                System.out.println(1);
            }
        }
    }
}
