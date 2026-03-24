package Class1;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Ex1 {
    public static void main(String[] args) {
        long timestamp = Instant.now().toEpochMilli();
        String fileName = "uniqueFile_" + timestamp + ".txt";

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File already exists: " + file.getName());
        } else {
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created successfully!\n");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                return;
            }
        }

        System.out.println("Name:          " + file.getName());
        System.out.println("Relative path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Can read:      " + file.canRead());
        System.out.println("Can write:     " + file.canWrite());
        System.out.println("Parent folder: " + file.getAbsoluteFile().getParentFile().getName());
    }
}
