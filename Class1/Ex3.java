package Class1;

import java.io.File;

public class Ex3 {

    public static void main(String[] args) {
        
    File file = new File("Class1");

    File[] files = file.listFiles();

    for (int i = 0; i < files.length; i++) {
        if(files[i].getName().endsWith(".txt")){
            System.out.println(files[i].getAbsolutePath());
        }
    }
    
  






    }
}
