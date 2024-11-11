import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClimbingTheLeaderboard {
    static int upper_bound (List<Integer> list, int k) {
        int first = 0, last = list.size() - 1;
        int ans = -1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (list.get(mid) <= k) {
                last = mid - 1;
            } else {
                ans = mid;
                first = mid + 1;
            }
        }

        return ans + 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>(), c = new ArrayList<>();

        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }

        m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            b.add(scan.nextInt());
        }

        c = a.stream().distinct().toList();

        for (int i = 0; i < m; i++) {
            System.out.format("%d\n", upper_bound(c, b.get(i)) + 1);
        }
    }
}