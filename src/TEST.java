import java.io.*;
import java.util.ArrayList;

public class TEST {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(Integer.parseInt(br.readLine()));
        while(al.get(al.size()-1) != 42){
            System.out.println(al.get(al.size()-1));
            al.add(Integer.parseInt(br.readLine()));

        }
    }
}
