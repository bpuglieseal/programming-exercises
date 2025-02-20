package Excercise2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStreamReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br;
        BufferedWriter bw;
        ArrayList<Path> paths = new ArrayList<Path>();
        char[] buffer = new char[20];
        String input;

        for (int i = 0; i < 3; i++) {
            System.out.format("Input the name of the file %d: ", i + 1);
            input = inStreamReader.readLine();

            Path inputFile = Paths.get(String.format("src/Excercise2/%s", input));
            paths.add(inputFile);
        }

        String firstFile = String.valueOf(paths.getFirst().toAbsolutePath());
        String secondFile = String.valueOf(paths.get(1).toAbsolutePath());
        String thirdFile = String.valueOf(paths.get(2).toAbsolutePath());

        System.out.println("Direccion de los archivos: ");
        System.out.format("Primer archivo: %s\n", firstFile);
        System.out.format("Segundo archivo: %s\n", secondFile);
        System.out.format("Tercer archivo: %s\n", thirdFile);

        System.out.println("---------------------------------------------");

        br = new BufferedReader(new FileReader(firstFile));
        bw = new BufferedWriter(new FileWriter(secondFile));

        System.out.println("Transfiriendo datos del primer archivo al segundo...");

        input = br.readLine();
        while (input != null) {
            bw.write(input + '\n', 0, input.length() + 1);
            input = br.readLine();
        }

        br.close();
        bw.close();

        System.out.println("Transfiriendo datos del segundo archivo al tercero...");

        br = new BufferedReader(new FileReader(secondFile));
        bw = new BufferedWriter(new FileWriter(thirdFile));

        int n = br.read(buffer);
        while (n > 0) {
            bw.write(buffer, 0, n);
            n = br.read(buffer);
        }

        bw.close();
        br.close();
    }
}
