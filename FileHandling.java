 import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        
        /*
        try {
        File myObj = new File("students.txt");
            if (myObj.createNewFile()) {
                System.out.println("Created Successfully: " + myObj.getName());
            } else {
                System.out.println("Sorry, File Exists.");
            }
        } catch (IOException e) {
            System.out.println("Error.....");
            e.printStackTrace();
        }
        */

        /*
        try {
            File file = new File("students.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error.....");
            e.printStackTrace();
        }
        */

        /* 
        File file = new File("students.txt"); 
        if (file.delete()) { 
            System.out.println("Deleted Successfully: " + file.getName());
        } else {
            System.out.println("Error......");
        }
        */

    }
}

