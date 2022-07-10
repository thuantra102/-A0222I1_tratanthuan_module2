package ss16_io.thuc_hanh.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\password.txt");
        Scanner scanner = new Scanner(file);
        String fileContent= "";
        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\newText.txt");
        writer.write(fileContent);
        writer.close();

    }
}
