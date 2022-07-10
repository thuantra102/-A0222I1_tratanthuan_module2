package ss16_io.thuc_hanh.Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    // 1. write string or array
    // 2. write object or list of object
    // 3. read date from a file
    public static void  writeToFile(List<Student> list) {
        try{
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
//            for (String s:
//                 arr) {
//                bw.write(s + "\n");
//            }
//            fw.write(txt + "\n");
//            bw.write("tra tan thuan", 0,13);
//            bw.write(s.toString());
//            list.forEach((student)-> {
//                try {
//                    bw.write(student.toString());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
            for (Student o: list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String[]> readFromFile() {
        List<String[]> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\CODEGYM\\A0222I1_tratanthuan_module2\\data.txt");
            BufferedReader br = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(fileReader);
            String line ="";
//            line = br.readLine();
            // read data by scanner
//            while (scanner.hasNextLine()) {
////                line = line.concat(scanner.nextLine() + "\n");
//                System.out.println(scanner.nextLine());
//            }
////            System.out.println(line);
            while (true) {
                line = br.readLine();
                if(line == null) {
                    break;
                }
                String[] txt = line.split(",");
                String name = txt[0];
                String age = txt[1];
                String sex = txt[2];

                list.add(new String[]{name, age, sex});

            }

        }catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }
    public static void main(String[] args) {
//        String txt = "Nguyen Van thuan";
//        String[] arr ={"Nguyen Van A", "Nguyen Van b", "Nguyen Van c"};
//        Student s = new Student("Nguyen Van a", 20, true);
//        Student s1 = new Student("Nguyen Van 4", 20, true);
//        Student s2 = new Student("Nguyen Van a3", 20, true);
//        Student s3 = new Student("Nguyen Van a2", 20, true);
//        Student s4 = new Student("Nguyen Van a1", 20, true);
//        List<Student>  list = new ArrayList<>();
//        list.add(s);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        writeToFile(list);
        System.out.println(readFromFile().toString());
        readFromFile().forEach((strings -> {
            System.out.println(strings.toString());
        }));

    }
}
