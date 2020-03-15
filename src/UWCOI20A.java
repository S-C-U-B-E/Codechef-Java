import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UWCOI20A {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long res = Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long temp = Long.parseLong(br.readLine());
                if(temp>res){res = temp;}
            }
            System.out.println(res);
        }
    }
}
