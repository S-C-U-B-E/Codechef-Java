import java.io.*;

public class ECJAN20A {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,b,c;

        String[] t = br.readLine().split(" "),temp;

        for(int i=1; i<=Integer.parseInt(t[0]); i++){
            temp = br.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            c = Integer.parseInt(temp[2]);

            if(a+b+c == 180){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
