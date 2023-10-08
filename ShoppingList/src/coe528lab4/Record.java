package coe528lab4;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author Asif Choudhury, 501111719
 */
public class Record {
    // Name of the associated file
    private String filename;
    private static Record instance = null;
    private File myFile;
    private FileWriter myWriter;
    
    private Record(String n) {
        filename = n;
        myFile = new File(filename);
    }
    
    // Creating only one instance of Record
    public static Record getInstance(){
        if(instance == null)
            instance = new Record("record.txt");
        return instance;
    }

    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try {
            // Write the code here
            Scanner myReader = new Scanner(myFile);         //Using a scanner to read from a file
            while(myReader.hasNextLine()){                  //Loop continues until the end of the file is reached. This checks whether
                String fileStr = myReader.nextLine();       //  there is a line still to be read in the file.
                System.out.println(fileStr);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try {
            // Write the code here
            myWriter = new FileWriter(myFile, true);        //Creating a FileWriter object and sending the file as a parameter along with
            myWriter.write(msg);                            //  setting the append parameter to true so Hello-1 and Hello-2 can keep
            myWriter.close();                               //  getting written to the end of the file.
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        Record r = Record.getInstance();
       
        // Do not modify the code below

        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " +
        "contains the following lines:");
        r.read();
    }
}
