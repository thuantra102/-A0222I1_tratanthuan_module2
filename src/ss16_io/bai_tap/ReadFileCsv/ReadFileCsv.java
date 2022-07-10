package ss16_io.bai_tap.ReadFileCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv<E> {
    public List<Country> listData(String filePath) {
        List<Country> list = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String temp[] = line.split(",");
                list.add(new Country(temp[0], temp[1],temp[2]));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        ReadFileCsv<String> readFileCsv = new ReadFileCsv<>();
        List<Country> list = readFileCsv.listData("D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\ss16_io\\bai_tap\\ReadFileCsv\\mydata.csv");
        list.forEach((country -> {
            System.out.println(country.toString());
        }));
    }
}
