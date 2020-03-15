import java.io.*;

public class ECJAN20B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int n,m,k;
        String[] temp;
        for(int i=1; i<=t; i++){
            temp = br.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            k = Integer.parseInt(temp[2]);


            int tot = 0,count = 0;
            while( k-tot >= n ){
                count++;
                tot = tot + (n+m);
            }
            k=k-tot;
            if(k<0) {
                System.out.println((n * count));
            }else{
                System.out.println((n*count + k));
            }
        }

    }
}
