package Stream.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    // Declarative approach
    // Filter
    // Sort
    // Any match
    // None Match
    // Max
    // Min
    // Group
    public static void main(String[] args) {
        List<Person> personList = (List<Person>) Stream.of(
        new Person("Thuan",4,Gender.FEMALE)
        ,new Person("Huong tra" ,17, Gender.FEMALE)
        ,new Person("Thao tra",32,Gender.MALE)
        ,new Person("Thach tra", 30,Gender.MALE)).collect(Collectors.toList());

//        personList.forEach(System.out::println);
        // filter
        List<Person> gender = personList.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
//        gender.forEach(System.out::println);
        // sort
       List<Person> sorted= personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
//        sorted.forEach(System.out::println);
        // All match
        boolean allMatch = personList.stream().allMatch( person -> person.getAge()>= 30);
//        System.out.println(allMatch);
        // any math
        boolean anyMatch = personList.stream().anyMatch(person -> person.getAge()< 18);
//        System.out.println(anyMatch);
        // none math
        // Contain => false (And not contain => true)
        boolean noneMatch = personList.stream().noneMatch(person -> person.getName().equals("Thuan"));
        boolean check = personList.stream()
                .noneMatch(person -> person.getName().equals("cc"));

//        System.out.println(check);
        // max
         personList.stream().max(Comparator.comparing(Person::getAge)).ifPresent(person -> {
//             System.out.println(person.toString());
         });
         // min
        personList.stream().min(Comparator.comparing(Person::getAge)).ifPresent(person -> {
//            System.out.println(person.toString());
        });
        // group
        Map<Gender, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(Person::getGender));
//        collect.forEach((gender1, people) -> {
//            System.out.println(gender1);
//            people.forEach(System.out::println);
//            System.out.println();
//        });
        // combination
//        Optional<String> olderFemalAge = personList.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
//                .max(Comparator.comparing(Person::getAge))
//                .map(Person::getName);
        Stream<Person> thuantra = personList.stream().filter(person -> person.getName().equals("Thuan tra"));
        System.out.println(thuantra.map(Person::getGender));

    }

}
