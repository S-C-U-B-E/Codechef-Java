import java.io.*;

public class TAVISUAL {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int n,c,q,l,r;
        while(t-- >0){
            String[] temp = br.readLine().split(" ");

            n = Integer.parseInt(temp[0]);
            c = Integer.parseInt(temp[1]);
            q = Integer.parseInt(temp[2]);

            while(q-- >0){
                String[] lr = br.readLine().split(" ");

                l = Integer.parseInt(lr[0]);
                r = Integer.parseInt(lr[1]);

                if(c>=l && c<=r){
                    c = r-(c-l);
                }
            }
            System.out.println(c);
        }
    }
}
