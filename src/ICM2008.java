import java.io.*;

public class ICM2008 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while (l-- > 0) {
            String[] temp = br.readLine().split(" ");

            long a = Long.parseLong(temp[0]);
            long b = Long.parseLong(temp[1]);
            long c = Long.parseLong(temp[2]);
            long d = Long.parseLong(temp[3]);

            if(a==b){
                System.out.println("YES");
            }else if(c == d){
                System.out.println("NO");
            }else{
                long sm = 0;
                long gt = 0;
                if(c<d){sm = c; gt = d;}else{sm = d; gt = c;}
                if(a>b){
                    while(a > b){
                        a+=sm;
                        b+=gt;
                    }
                }else if(b>a){
                    while(b > a){
                        a+=gt;
                        b+=sm;
                    }
                }

                if(a==b){
                    System.out.println("YES") ;
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
