
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String[] names = {"john", "Carl"};

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myOutputFile.txt"))) {
            writer.write("Writing to a file.");
            writer.newLine(); // Adds a newline in the file
            writer.write("Here is another line");
            writer.newLine(); // Adds a newline in the file

            // Write each name from the array to the file
            for (String name : names) {
                writer.write(name);
                writer.newLine(); // Adds a newline after each name
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
