package Excercise2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStreamReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br;
        BufferedWriter bw;
        ArrayList<Path> paths = new ArrayList<Path>();
        String input;

        for (int i = 0; i < 3; i++) {
            System.out.format("Input the name of the file %d: ", i + 1);
            input = inStreamReader.readLine();

            Path inputFile = Paths.get(String.format("src/Excercise2/%s", input));
            paths.add(inputFile);
        }


    }
}
