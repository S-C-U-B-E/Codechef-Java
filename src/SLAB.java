import java.io.*;

public class SLAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while (l-- > 0) {
            double n = Double.parseDouble(br.readLine());
            /*250,001 to Rs. 500,000	5%
                    from Rs. 500,001 to Rs. 750,000	10%
                    from Rs. 750,001 to Rs. 1,000,000	15%
                    from Rs. 1,000,001 to Rs. 1,250,000	20%
                    from Rs. 1,250,001 to Rs. 1,500,000	25%
                    above Rs. 1,500,000	30%*/

            double t1 = 0.05*(500000 - 250000);
            double t2 = 0.10*(750000 - 500000);
            double t3 = 0.15*(1000000 - 750000);
            double t4 = 0.20*(1250000 - 1000000);
            double t5 = 0.25*(1500000 - 1250000);

            double res = 0.0;
            if(n <= 250000){res = 0.0;}
            else if(n>250000 && n<= 500000){res = 0.05*(n-250000);}
            else if(n>500000 && n<=750000){res = t1+0.10*(n-500000);}
            else if(n>750000 && n<=1000000){res = t1+t2+0.15*(n-750000);}
            else if(n>1000000 && n<=1250000){res = t1+t2+t3+0.20*(n-1000000);}
            else if(n>1250000 && n<=1500000){res = t1+t2+t3+t4+0.25*(n-1250000);}
            else if(n>1500000){res = t1+t2+t3+t4+t5+0.30*(n-1500000);}

            System.out.println((long)(n-res));
        }
    }
}
