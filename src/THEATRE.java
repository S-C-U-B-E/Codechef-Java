import java.io.*;
import java.util.*;

public class THEATRE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        long tot_result = 0;

        while (l-- > 0) {

            Integer arr[][] = new Integer[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = 0;
                }
            }

            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                String[] temp = br.readLine().split(" ");
                int t = Integer.parseInt(temp[1]);
                char m = temp[0].charAt(0);

                arr[m - 'A'][(t / 3) - 1] += 1;
            }

            /*for(int i=0;i<4; i++){
                for(int j=0;j<4;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("\n");
            }*/

            // <<<<<<<<<< __PARTIAL CONSTRAINTS__  >>>>>>>>>>>>>
/*
            int s=0;
            ArrayList<Integer> ipos = new ArrayList<>();
            ArrayList<Integer> jpos = new ArrayList<>();

            int maxi = Integer.MIN_VALUE;
            int itemp = 0,jtemp=0;
            for(int i=0;i<4; i++){
                for(int j=0;j<4;j++){
                    if(arr[i][j] > maxi){
                        maxi = arr[i][j];
                        itemp = i;
                        jtemp = j;
                    }
                }
            }
            ipos.add(itemp);
            jpos.add(jtemp);

            //System.out.println(maxi);
            if(maxi != 0){
            s+=100*maxi;}else{s-=100;}

            maxi = Integer.MIN_VALUE;
            for(int i=0;i<4; i++){
                if(ipos.contains(i))
                    continue;
                for(int j=0;j<4;j++){
                    if(jpos.contains(j))
                    { continue;}
                    else {
                    if(arr[i][j] > maxi){
                        maxi = arr[i][j];
                        itemp = i;
                        jtemp = j;
                        }
                    }
                }
            }
            ipos.add(itemp);
            jpos.add(jtemp);

            //System.out.println(maxi);
            if(maxi != 0){
                s+=75*maxi;}else{s-=100;}

            maxi = Integer.MIN_VALUE;
            for(int i=0;i<4; i++){
                if(ipos.contains(i))
                    continue;
                for(int j=0;j<4;j++){
                    if(jpos.contains(j))
                    { continue;}
                    else {
                        if(arr[i][j] > maxi){
                            maxi = arr[i][j];
                            itemp = i;
                            jtemp = j;
                        }
                    }
                }
            }
            ipos.add(itemp);
            jpos.add(jtemp);

            //System.out.println(maxi);
            if(maxi != 0){
                s+=50*maxi;}else{s-=100;}

            maxi = Integer.MIN_VALUE;
            for(int i=0;i<4; i++){
                if(ipos.contains(i))
                    continue;
                for(int j=0;j<4;j++){
                    if(jpos.contains(j))
                    { continue;}
                    else {
                        if(arr[i][j] > maxi){
                            maxi = arr[i][j];
                            itemp = i;
                            jtemp = j;
                        }
                    }
                }
            }
            ipos.add(itemp);
            jpos.add(jtemp);

            //System.out.println(maxi);
            if(maxi != 0){
                s+=25*maxi;}else{s-=100;}

            //System.out.println(s);

            res.add(s);


        }
        int s =0;
        for(int i:res){
            System.out.println(i);
            s +=i;
        }
        System.out.println(s);*/


        // <<<<<<<<<< __ORIGINAL CONSTRAINTS__  >>>>>>>>>>>>>


            int result = Integer.MIN_VALUE;

            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    if(j==i) continue;

                    for(int k=0; k<4 ;k++){
                        if(k==i || k==j) continue;

                        for(int q=0; q<4; q++){
                            if(q==i || q==j || q==k) continue;

                            ArrayList<Integer> intermediate = new ArrayList<>();
                            intermediate.add(arr[0][i]);
                            intermediate.add(arr[1][j]);
                            intermediate.add(arr[2][k]);
                            intermediate.add(arr[3][q]);

                            Collections.sort(intermediate);
                            int sum = 0;

                            if(intermediate.get(0) != 0 ){ sum+=intermediate.get(0)*25; }else{ sum-=100;}
                            if(intermediate.get(1) != 0 ){ sum+=intermediate.get(1)*50; }else{ sum-=100;}
                            if(intermediate.get(2) != 0 ){ sum+=intermediate.get(2)*75; }else{ sum-=100;}
                            if(intermediate.get(3) != 0 ){ sum+=intermediate.get(3)*100; }else{ sum-=100;}

                            if(sum > result) { result = sum; }
                        }
                    }
                }
            }

            System.out.println(result);

            tot_result+=result;
        }

        System.out.println(tot_result);
    }
}