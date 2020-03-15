/*
*
* HACKEREARTH
*
* BIT-MASK
*
* */

import  java.io.*;
public class SumofNumbers {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int s = Integer.parseInt(br.readLine());

            int[] a = new int[n];
            for(int i=0; i<n; i++){a[i] = Integer.parseInt(arr[i]);}

            int tot = 1 << n;

            int done = 0;
            for(int i=1; i<tot ; i++){
                int sum = 0;
                for(int j=0; j<n; j++){
                    int chck = 1 << j;
                    if((i & chck) != 0){
                        sum += a[j];
                    }
                }
                if(sum == s){done = 1;break;}
            }

            if(done == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
