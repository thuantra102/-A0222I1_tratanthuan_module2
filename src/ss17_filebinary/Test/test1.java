package ss17_filebinary.Test;

import ss16_io.bai_tap.ReadFileCsv.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\ss17_filebinary\\Test\\newTest.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.write(1101);
            List<Country> a = new ArrayList<>();
            a.add(new Country("1","Q","A"));
            a.add(new Country("2","B","B"));

            objectOutputStream.writeObject(a);

//            objectOutputStream.
            objectOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\ss17_filebinary\\Test\\newTest.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Country> countries = (List<Country>) objectInputStream.readObject();
           countries.forEach(System.out::println);
            objectInputStream.close();


        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
