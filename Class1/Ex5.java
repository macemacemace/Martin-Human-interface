package Class1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex5 {

    public static void main(String[] args) {
        
    byte[] data = {10,20,30,40,50};

    try {
       FileOutputStream output = new FileOutputStream("binaryData.bin"); 


       output.write(data);

       output.close();

       FileInputStream input = new FileInputStream("binaryData.bin");

       input.read(data);
        for(int i = 0; i < data.length; i++){
    System.out.println(data[i]);
}

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    
   
    

    
    
    
  






    }
}
