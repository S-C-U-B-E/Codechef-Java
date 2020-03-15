import java.io.*;

public class DECSTR {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st= "abcdefghijklmnopqrstuvwxyz";
        StringBuilder s = new StringBuilder(st).reverse();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            StringBuilder res=new StringBuilder();
            int n=Integer.parseInt(br.readLine());
            if(n%25!=0)
            res.append(s.substring(25-n%25));

            for(int i=0;i<n/25;i++)
                res.append(s);
                System.out.println(res);

        }
    }
}
