import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            sb.append(solve()).append("\n");
        }

        System.out.print(sb);
        // solve();
    }

    private static int solve() throws Exception {

        // st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        // String s = br.readLine();
        // int m = Integer.parseInt(st.nextToken());
        List<Pair> list = new ArrayList<>();
        long totalW = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            totalW += w;
            int p = Integer.parseInt(st.nextToken());
            list.add(new Pair(w, p, w + p));
        }

        list.sort((a, b) -> {
            return Integer.compare(b.total, a.total);
        });

        int res = n;
        long totalP = 0;
        for (int i = 0; i < n && totalP < totalW; i++) {
            Pair pair = list.get(i);
            totalW -= pair.weight;
            totalP += pair.power;
            res--;
            // System.out.println(pair.weight + " " + pair.power);
        }

        return res;
    }

    static class Pair {
        int weight;
        int power;
        int total;

        Pair(int weight, int power, int total) {
            this.weight = weight;
            this.power = power;
            this.total = total;
        }
    }
}
