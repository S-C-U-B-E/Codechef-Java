import java.io.*;

import static java.lang.Math.pow;

public class PLZLYKME {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long l,d,s,c;
        double res;
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            String temp[] = br.readLine().split(" ");
            l=Long.parseLong(temp[0]);
                    d=Long.parseLong(temp[1]);
                            s=Long.parseLong(temp[2]);
                                    c=Long.parseLong(temp[3]);

                                    res = s*pow((1+c),(d-1));
            if(res >= l) {
                System.out.println("ALIVE AND KICKING");
            }else{
                System.out.println("DEAD AND ROTTING");
            }
        }
    }
}
