import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NOTALLFL {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args)throws IOException {
        FastReader sc = new FastReader();//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = sc.nextInt();//int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            /*String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);*/
            int n = sc.nextInt();
            int k = sc.nextInt();

            //String[] s = br.readLine().split(" ");
             //s = br.readLine().split(" ");
            int[] a = new int[n];//int[] a = new int[s.length];
            for(int i=0;i<n;i++){a[i] = sc.nextInt();/*a[i] = Integer.parseInt(s[i]);*/}
            HashSet<Integer> klist = new HashSet<>();
            for(int i=1;i<=k;i++)klist.add(i);
            int[] kcount = new int[k+1];
            for(int i=1;i<=k;i++)kcount[i] = 0;

            if(k==2){
            ArrayList<Integer> al = new ArrayList<>();
                int c = 1;
                for(int i=1;i<n;i++){
                    if(a[i]!=a[i-1]){al.add(c); c=0;}
                    c++;
                }

                al.add(c);
                //System.out.println(al);
            System.out.println(Collections.max(al));
            }

            else{
                ArrayList<Integer> ans = new ArrayList<>();
                ArrayList<Integer> found = new ArrayList<>();
                HashSet<Integer> found_set  = new HashSet<>();

                found.add(a[0]);found_set.add(a[0]);kcount[a[0]]++;
                int window = 1;int strt_window = 0;
                for(int i=1;i<n;i++){
                   /*if(!found.contains(a[i])){found.add(a[i]);}*/ found.add(a[i]);
                   window++;kcount[a[i]]++;
                   if(kcount[a[i]] == 1)found_set.add(a[i]);

                   if(found_set.containsAll(klist)){
                        ans.add(window-1);
                        //int ind = found.indexOf(a[strt_window]);
                       found.remove(0);/*found_set = new HashSet<>(found);*/
                       kcount[a[strt_window]]--;
                       if(kcount[a[strt_window]] == 0)found_set.remove(a[strt_window]);
                       strt_window++;window--;
                   }

                }
                ans.add(window);
                System.out.println(Collections.max(ans));
            }


        }
    }
}

//1 1 1 1 2 2 1 2 1 2 2 2 2 2 2 2 2
/*15 4
1 2 3 3 3 2 2 1 4 4 4 4 3 2 4*/