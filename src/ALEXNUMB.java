import java.io.*;


public class ALEXNUMB {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++){
            long val = Long.parseLong(br.readLine());

            String[] inp = br.readLine().split(" ");


            System.out.println(((val)*(val-1))/2 );
        }
    }
}
