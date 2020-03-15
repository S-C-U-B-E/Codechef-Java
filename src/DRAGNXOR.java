import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class DRAGNXOR {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            long a = Integer.parseInt(temp[1]);
            long b = Integer.parseInt(temp[2]);

            int nbk = n;
            String abin = Long.toBinaryString(a);
            String bbin = Long.toBinaryString(b);
            if(n>abin.length())
            {
                String app = "";
                for(int i=1; i<=n-abin.length(); i++){
                    app = app+"0";
                }
                abin = app+abin;
            }
            if(n>bbin.length())
            {
                String app = "";
                for(int i=1; i<=n-bbin.length(); i++){
                    app = app+"0";
                }
                bbin = app+bbin;
            }
            //System.out.println(a+": "+abin+" "+b+": "+bbin);

            int abin_1 = Collections.frequency(Arrays.asList(abin.split("")),"1");
            int bbin_1 = Collections.frequency(Arrays.asList(bbin.split("")),"1");

           // System.out.println(a+": "+abin_1+" "+b+": "+bbin_1);

            int tot = abin_1 + bbin_1;

            StringBuilder res = new StringBuilder();

            int i;
            if(tot > nbk)
                tot  =  nbk - (tot - nbk);
            for(i=1; i<= tot; i++){
                res.append("1");
            }
            for(int j=i; j<= nbk ; j++){
                res.append("0");
            }


            String res1 = new String(res);
            //System.out.println(res1);
            System.out.println(Long.parseLong(res1,2));
        }
    }
}
