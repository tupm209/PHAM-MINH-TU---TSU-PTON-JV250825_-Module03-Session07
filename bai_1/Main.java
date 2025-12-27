package bai_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle();
        System.out.println("Hình chữ nhật 1:");
        rectangle_1.display();

        Rectangle rectangle_2 = new Rectangle(5.0, 3.0);
        System.out.println("Hình chữ nhật 2:");
        rectangle_2.display();
    }
}
