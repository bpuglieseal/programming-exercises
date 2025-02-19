package Excercise1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputFile = Paths.get("src/Excercise1/nums.bin");
        Path outputFile = Paths.get("src/Excercise1/nums.txt");

        FileReader fr = new FileReader(new File(inputFile.toUri()));
        FileWriter fw = new FileWriter(new File(outputFile.toUri()));
        String line;

        BufferedReader bufferedReader = new BufferedReader(fr);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        line = bufferedReader.readLine();
        while (line != null) {
            bufferedWriter.write(line + "\n", 0, line.length() + 1);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}