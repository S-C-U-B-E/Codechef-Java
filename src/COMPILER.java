import java.io.*;

public class COMPILER {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());


        String st = "";
        while(t-- > 0){
            st = br.readLine();
            char ch;
            int count = 0;
            int c = 0;
            for(int i=0; i<st.length(); i++) {
                ch = st.charAt(i);
                if (ch == '<') {
                        c++;

                } else {c--;
                if(c==0){
                    count=i+1;
                }else if(c<0){
                    break;
                }

                }
            }

            System.out.println(count);
        }
    }
}
