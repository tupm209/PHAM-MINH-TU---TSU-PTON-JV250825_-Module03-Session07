package bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student("Bob", 21, "A1", 7.0);
        studentArray[1] = new Student("Eve", 20, "A1", 8.0);
        studentArray[2] = new Student("John", 20, "A1", 9.0);
        studentArray[3] = new Student("Alice", 20, "A2", 8.5);
        studentArray[4] = new Student("David", 22, "A2", 6.5);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm min: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập điểm max: ");
        double max = Double.parseDouble(sc.nextLine());

        System.out.println("Danh sách sinh viên có điểm trung bình từ " + min + " đến " + max);
        for (Student student : studentArray){
            if(student.getAvgScore() >= min && student.getAvgScore() <= max){
                System.out.println(student);
            }
        }

        sc.close();

    }
}
