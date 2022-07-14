package Baitap.View;

import Baitap.Model.Phone.Phone;
import Baitap.Util.NotFoundException;
import FinalExam.Model.People.Patient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PhoneManage {

    public static final String filePath ="D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\Baitap\\data\\data.csv";


    public static List<Phone> listPhone;
    private Baitap.Util.NotFoundException NotFoundException;


    public PhoneManage() {
        listPhone = new ArrayList<>();
    }
    public  void addPhone(Phone phone) {
        int lastIndex = listPhone.size()-1;
        if(listPhone.isEmpty()) {
            phone.setId(1);
        }else  {
            int lastId = listPhone.get(lastIndex).getId() ;
            phone.setId(lastId +1);
        }
        listPhone.add(phone);

    }
    public void display() {
//        `Map<? extends Class<?>, List<Phone>> collect = listPhone.stream().collect(Collectors.groupingBy(Object::getClass));
//        System.out.println(collect.getClass());`
        listPhone.forEach(System.out::println);
    }
    public void deleteById(int id) throws NotFoundException {
        if(!listPhone.removeIf(e -> e.getId() == id)){
            throw new NotFoundException("Id is not exists");
        }
    }
    public Phone searchByname(String name) {
        Optional<Phone> searchingName = listPhone.stream().filter(phone -> phone.getName().equals(name)).findFirst();
        if(!searchingName.isPresent()) {
            return null;
        }
        return searchingName.get();
    }
    public int updatePhoneById(int id) {
//        Optional<Phone> updateId = listPhone.stream().filter(phone -> phone.getId() == id);
//        if(!updateId.isPresent()) {
//            return null;
//        }
//        return updateId.get();
        for (Phone phone: listPhone) {
            if(phone.getId() == id) {
                return listPhone.indexOf(phone);
            }
        }
        return -1;

    }
    public void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (Phone p : listPhone) {
                bufferedWriter.write(String.valueOf(p.getInfo()));


            }
//            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }
