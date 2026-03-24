package Class1;

import java.io.File;

public class Ex7 {

    public static void main(String[] args) {

        int n = 7; 
        File folder = new File("Class1");
        File[] files = folder.listFiles();

        long cutoff = System.currentTimeMillis() - (n * 24 * 60 * 60 * 1000L);

        for (int i = 0; i < files.length; i++) {
            if (files[i].lastModified() >= cutoff) {
                System.out.println(files[i].getName());
            }
        }
    }
}