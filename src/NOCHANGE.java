import java.io.*;

public class NOCHANGE {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while(l-- > 0){
            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            long p = Long.parseLong(temp[1]);

            temp = br.readLine().split(" ");
            long d[] = new long[temp.length];
            for(int i=0; i<temp.length; i++){
                d[i] = Long.parseLong(temp[i]) ;
            }

            long res[] = new long[temp.length];
            for(int i=0; i<temp.length; i++){
                res[i] = 0;
            }

            /*int index = -1;
            long culprit = (long)0;
            for(Long i:d){
                index++;
                if(p%i != 0) {culprit = i; break;}
            }

            if(culprit !=0 ){
                System.out.print("YES");
                res[index] = (p/culprit) + (long)1;
                for(Long i:res)
                System.out.print(" "+i);
                System.out.println();
            }else{
                System.out.println("NO");
            }*/

            int done =0;
            for(int i=n-1; i>=0; i--){
                if(p%d[i] !=0 ){
                    res[i] = (p/d[i]) + 1;
                    done = 1;
                    break;
                }else{
                    long baki = d[i];
                    for(int j=i-1; j>=0; j--){
                        if(baki%d[j] !=0 ) { res[j] = (baki/d[j])+1; res[i] = (p/baki)-1; done =  1; break; }
                        else{}
                    }
                    if(done == 1) {break;}
                }
            }

            if(done == 0){
                System.out.println("NO");
            }else{
                System.out.print("YES");
                for(Long i:res)
                    System.out.print(" "+i);
                System.out.println();
            }
        }
    }
}
