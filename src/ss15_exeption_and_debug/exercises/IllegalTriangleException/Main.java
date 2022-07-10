package ss15_exeption_and_debug.exercises.IllegalTriangleException;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(-2,3,5);
            System.out.println(triangle.getPerimeter());
        }catch (IllegalTriangleException e) {
//           throw new Exception("321");
            e.printStackTrace();
        } finally {
            System.out.println("ẻer");
        }
        System.out.println("rhwerwe");

    }
}
