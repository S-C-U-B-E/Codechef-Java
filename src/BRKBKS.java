import java.io.*;

public class BRKBKS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while (l-- > 0) {
            String[] s = br.readLine().split(" ");

            int st = Integer.parseInt(s[0]);
            int w1 = Integer.parseInt(s[1]);
            int w2 = Integer.parseInt(s[2]);
            int w3 = Integer.parseInt(s[3]);

            int count = 0;

            if(w1+w2+w3 <= st){
                count = 1;
            }else if(w1+w2 <= st || w2+w3 <= st ){
                count = 2;
            }else{
                count = 3;
            }

            System.out.println(count);
        }
    }
}
