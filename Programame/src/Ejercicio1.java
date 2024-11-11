import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5, i = 1, hmst8 = 0;
        String ws = "";
        int wsm = 10;
        float afs = 0;
        String code;

        while (i <= n) {
            int mxMark = 0, mmMark = 10;
            System.out.format("Digite el código del estudiante %d: ", i);
            code = br.readLine();

            for (int j = 1; j <= 5; j++) {
                System.out.format("Digite la calificación %d del estudiante %s: ", j, code);
                int a = Integer.parseInt(br.readLine());

                if (i == 1) {
                    afs += a;
                }

                if (a > mxMark) {
                    mxMark = a;
                }
                if (a < mmMark) {
                    mmMark = a;
                }
            }

            if (mxMark > 8) {
                hmst8++;
            }

            if (mmMark < wsm) {
                ws = code;
                wsm = mmMark;
            }

            System.out.format("Estudiante: %s\n", code);
            System.out.format("Mejor calificación: %d\n", mxMark);
            System.out.format("Peor calificación: %d\n", mmMark);
            i++;
        }

        System.out.format("\nEstudiante con peor calificación: %s -> %d\n", ws, wsm);
        System.out.format("Estudiantes con califación máxima mayor a 8: %s\n", hmst8);
        System.out.format("Promedio de la primera nota de cada estudiante: %s", String.format("%.2f", afs / n));
    }
}