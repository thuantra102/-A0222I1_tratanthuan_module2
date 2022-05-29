package ss5_access_modifier_static_getter_setter.bai_tap.Student;

public class Student {
    private  String name = "John";
    private String lop = "Co2";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    private void setLop(String lop) {
        this.lop = lop;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("thuan");
        System.out.println(st1.name);
    }



}
