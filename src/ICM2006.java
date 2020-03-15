import java.io.*;

public class ICM2006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        while (l-- > 0) {
            String s = br.readLine();

            int len = s.length();
            if(len >= 4){
                if(s.charAt(len-4)=='1' && s.charAt(len-3)=='0' && s.charAt(len-2)=='0' && s.charAt(len-1)=='0'){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}