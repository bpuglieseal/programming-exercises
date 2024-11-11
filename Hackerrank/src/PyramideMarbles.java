import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PyramideMarbles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i = 0;
        n = Integer.parseInt(br.readLine());
        while (i < n) {
            long a = Integer.parseInt(br.readLine());
            long s = 0, m = 0;
            for (int j = 1; j <= a; j++) {
                s += (long) j * j;
                m += j;
            }
            System.out.println((s + m) / 2);
            i++;
        }
    }
}
