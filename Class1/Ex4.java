package Class1;

import java.io.File;

public class Ex4 {

    public static void main(String[] args) {
        
    File file = new File("Class1");

    File[] files = file.listFiles();

   
    
    if(files.length == 0){
            System.out.println("dir is emppty");
        }
    else{
        System.out.println("dir is not empty");
    }
    
    
  






    }
}
