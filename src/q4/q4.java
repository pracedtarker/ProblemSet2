package q4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class q4 {
    public static void main(String args[]) throws IOException {
        //Creating a File object for directory
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the address of your directory: ");
        String userstring = sc.nextLine();
        System.out.println();
        if (userstring == null || userstring.trim().isEmpty()) {
            System.out.println("Sorry, I cannot accept an empty address.");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        } else {
        File directoryPath = new File(userstring);
        File filesList[] = directoryPath.listFiles();
        System.out.println("Meta-data of your directory:");
        for(File file : filesList) {
            Path path = file.toPath();
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File name: "+file.getName());
            System.out.println("Size :"+file.getTotalSpace());
            System.out.println("creation on: " +attr.creationTime());
            System.out.println("Last Modified: " + file.lastModified());
            System.out.println(" ");
        }
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
    }
}
}
