import java.io.*;


public class DYNAMO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine()), res;
        long s = 0,c = 0,e = 0;
        while (l-- > 0) {
            int n = Integer.parseInt(br.readLine());

            long a = Long.parseLong(br.readLine());
            long max =Math.round(Math.pow(10,n));
            s=2*(max)+a;
            System.out.println(s);
            long b = Long.parseLong(br.readLine());
            c = max - b;
            System.out.println(c);
            long d = Long.parseLong(br.readLine());
            e = max - d;
            System.out.println(e);


            res = Integer.parseInt(br.readLine());
            if(res == -1){ break;}
        }
    }
}
