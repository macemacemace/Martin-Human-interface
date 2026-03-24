package Class1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {

    public static void main(String[] args) {

        File file = new File("appendText.txt");

        try {
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created!");
            }

            FileWriter fw = new FileWriter(file, true);
            fw.write("This text was appended!\n");
            fw.close();

            System.out.println("Text appended successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}