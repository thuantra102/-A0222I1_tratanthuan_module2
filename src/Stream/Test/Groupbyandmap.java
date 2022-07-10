package Stream.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupbyandmap {
    public static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        personList.add(new Person("Thuan", 4, Gender.MALE, "Vietnam"));
        personList.add(new Person("Huong", 9, Gender.FEMALE, "China"));
        personList.add(new Person("Huy", 10, Gender.MALE, "Vietnam"));
        personList.add(new Person("Duyen", 20, Gender.FEMALE, "China"));
        personList.add(new Person("Xuan", 21, Gender.FEMALE, "China"));
        personList.add(new Person("Nam", 32, Gender.MALE, "Vietnam"));
        personList.add(new Person("Long", 32, Gender.MALE, "Singapore"));
        personList.add(new Person("Tuan", 32, Gender.FEMALE, "USA"));
        personList.add(new Person("Q.Anh", 32, Gender.MALE, "Singapore"));

        // obtain vietnamese people by paritioningby or groupingby
        Map<Boolean, List<Person>> vietnam = personList.stream().collect(Collectors.partitioningBy(person -> person.getCountry().equalsIgnoreCase("Vietnam")));
//     vietnam.get(true).forEach(System.out::println);
        Map<Boolean, List<Person>> vietnam1 = personList.stream().collect((Collectors.groupingBy(person -> person.getCountry().equalsIgnoreCase("vietnam"))));
//        vietnam1.get(true).forEach(System.out::println);
        // count vietnamese people by partioningby or groupingby
        Map<Boolean, Long> vietnam2 = personList.stream().collect(Collectors.partitioningBy(person -> person.getCountry().equalsIgnoreCase("Vietnam"),
                Collectors.counting()));
//        System.out.println(vietnam2.get(true));
        // obtain person in each country
        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(person -> person.getCountry()));
        collect.forEach((country,person)->{
//            System.out.println(country);
//            person.forEach(System.out::println);
//            System.out.println();
        });
        // obtain person and map to do something
        Map<Boolean, List<String>> vietnam3 = personList.stream().collect(Collectors.groupingBy(person -> person.getCountry().equalsIgnoreCase("Vietnam"),
                Collectors.mapping(person -> person.getName().toUpperCase(), Collectors.toList())));
////        vietnam3.get(true).forEach(System.out::println);
//        System.out.println(vietnam3.get(true).toString());

    }

}
