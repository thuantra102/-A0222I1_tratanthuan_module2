package ss5_access_modifier_static_getter_setter.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change() {
        college = "CodeGym";
    }
    public void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student student1 = new Student(111, "Thuan");
        Student student2 = new Student(222, "Long");
        Student student3 = new Student(333, "Tuan");
        Student.change();
        student1.display();
        student2.display();
        student3.display();
    }
}
