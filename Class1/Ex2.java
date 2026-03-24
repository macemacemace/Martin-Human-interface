package Class1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        

        String line;
        
        try {
            br = new BufferedReader(new FileReader("Class1\\content.txt"));
            line = br.readLine();
            int i = 0;
            while(line != null){
                i++;
                line = br.readLine();
            }

            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
