package Baitap.View;

import Baitap.Model.Phone.Genuine;
import Baitap.Model.Phone.Phone;
import Baitap.Util.NotFoundException;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneManage {
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
//        Map<? extends Class<?>, List<Phone>> collect = listPhone.stream().collect(Collectors.groupingBy(Object::getClass));
//        System.out.println(collect.getClass());
//        listPhone.forEach(System.out::println);
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
    public Phone updatePhoneById(int id) {
        Optional<Phone> updateId = listPhone.stream().filter(phone -> phone.getId() == id).findFirst();
        if(!updateId.isPresent()) {
            return null;
        }
        return updateId.get();
    }



}
