import java.io.*;
import java.util.*;

public class SNUG_FIT {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            String[] a1 = br.readLine().split(" ");
            String[] a2 = br.readLine().split(" ");

            ArrayList<Long> l1 = new ArrayList<>();
            ArrayList<Long> l2 = new ArrayList<>();

            for (int j = 0; j < a2.length; j++) {
                l1.add(Long.parseLong(a1[j]));
                l2.add(Long.parseLong(a2[j]));
            }
            Collections.sort(l1);
            Collections.sort(l2);
/*
            long s = 0;
            long p2 = 0;
            for (long i : l1) {
                long res = Long.MAX_VALUE;

                for (long j : l2) {

                    if (Math.abs(i - j) < res) {
                        p2 = j;
                        res = Math.abs(i - j);
                    }
                }
                s+=Math.min(i,p2);
                l2.remove(p2);
            }*/

            //System.out.println(l1.size()*Math.min(l1.get(0),l2.get(0)));
            //System.out.println(s);
            long s =0;
            for(int i=0;i<l1.size();i++){
                //System.out.print(Math.min(l1.get(i),l2.get(i))+" ");
                s+=Math.min(l1.get(i),l2.get(i));
            }
            System.out.println("\n"+s);
        }

    }
}
