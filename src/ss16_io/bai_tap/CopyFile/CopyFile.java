package ss16_io.bai_tap.CopyFile;
import java.io.*;
import java.nio.file.FileSystemException;
import  java.util.*;

public class CopyFile {
    public static void main(String[] args) {
        final String filePath = "D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\ss16_io\\bai_tap\\CopyFile\\data.txt";
        List<String> list = readFile(filePath);
//        System.out.println(list.toString());
        writeFile("D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\ss16_io\\bai_tap\\CopyFile\\result.txt",list);

    }
    public static List<String> readFile(String filePath) {
        List<String> listData = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while( (line = bufferedReader.readLine()) != null) {
                listData.add(line);
            }
            bufferedReader.close();
        }catch (FileNotFoundException e) {
            System.err.println("File Not Exist");
        }catch (IOException e) {
            e.printStackTrace();
        }
        return listData;
    }
    public static void writeFile(String filePath,List<String> list ) {
        boolean flag = true;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String data: list) {
                bufferedWriter.write(data + "\n");

            }
            bufferedWriter.close();
        }
        catch (FileNotFoundException e) {
            flag = false;
            System.err.println("File not found");
        }
        catch (FileSystemException e) {
            flag = false;
            System.err.println("Wrong type file name");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(flag) {
                System.out.println("Done");
            }
        }
    }
}
