package fr.ynov.java.medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileData = "";

        Scanner myReader = new Scanner(new File("test.txt"));
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fileData += data + "\n";
        }
        myReader.close();




        File file = new File("written.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(fileData);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
