import java.io.*;

public class PSHOT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while (l-- > 0) {
            //long n = Integer.parseInt(br.readLine());
            String st = br.readLine();
            long n = st.length()/2;
            String[] s = st.split("");

            int q=0;
            long s1=0, s2=0, ans=2*n-1;
            for(int i=0; i<n; ++i) {
                //shoots the shots 2*i (A) and 2*i+1 (B)
                //update score of A
                s1+=Long.parseLong(s[2*i]);
                //B has n-i shots left, check if B can match A
                if(s1>s2+n-i) {
                    ans=2*i;
                    q=1;
                    System.out.println("q="+q+" s1="+s1+" s2="+s2);
                    break;
                }
                //A has n-1-i shots left, check if A can match B
                if(s2>s1+n-1-i) {
                    ans=2*i;
                    q=2;
                    System.out.println("q="+q+" s1="+s1+" s2="+s2);
                    break;
                }
                //update score of B
                s2+=Long.parseLong(s[2*i+1]);
                //both teams have n-1-i shots left
                if(s1>s2+n-1-i) {
                    ans=2*i+1;
                    q=3;
                    System.out.println("q="+q+" s1="+s1+" s2="+s2);
                    break;
                }
                if(s2>s1+n-1-i) {
                    ans=2*i+1;
                    q=4;
                    System.out.println("q="+q+" s1="+s1+" s2="+s2);
                    break;
                }
            }
            System.out.println("\nBLOCK: "+q);
            System.out.println(ans+1);
        }
    }
}
