package Trial;


import java.io.File;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Scanner;



public class Prva {
    public static void main(String[] args) throws Exception {

        try {
            Scanner scanner = new Scanner(System.in);
        System.out.println("enter file name:  ");
        String fileName = scanner.next() + ".txt";
        System.out.println("enter file name2 :  ");
        String fileName2 = scanner.next() + ".txt";
        Path filePath = Paths.get(fileName);
        Path filePath2 = Paths.get(fileName2);



        
        Files.createFile(filePath);
        System.out.println("File created: "+ filePath);
        
        File file = filePath.toFile();
        BasicFileAttributes f = Files.readAttributes(filePath, BasicFileAttributes.class);
        
        
        System.out.println("File name: " + f.getClass());
        System.out.println("Size: " + f.size());
         System.out.println("Path: " + filePath);
         System.out.println("Is file: " + f.isRegularFile());
        System.out.println("Is directory: " + f.isDirectory());
        System.out.println("Last modified: "+ f.lastModifiedTime());
        System.out.println("permissions for r/w/x: "+ file.canRead()+" "+file.canWrite()+ " " + file.canExecute());
            

        System.out.println("Insert website");
        String website = scanner.nextLine();
        InetAddress[] addresses = InetAddress.getAllByName(website);
        for(InetAddress address : addresses){
            System.out.println(address);
        }

        byte[] file1 = Files.readAllBytes(filePath);
        byte[] file2 = Files.readAllBytes(filePath2);

        boolean areEqual = Arrays.equals(file1,file2);
        System.out.println("Files are equal: "+ areEqual);




        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
