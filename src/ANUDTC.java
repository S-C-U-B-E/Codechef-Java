import java.io.*;

public class ANUDTC {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++){
            int n = Integer.parseInt(br.readLine());

            if(360%n==0)
                System.out.print("y ");
            else
                System.out.print("n ");
            if(n>360)
                System.out.print("n ");
            else
                System.out.print("y ");
            if(n>26)
                System.out.println("n");
            else
                System.out.println("y");


        }


    }
}
