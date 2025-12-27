package bai_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoriesList list = new CategoriesList();
        int choice;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị danh sách danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    list.addItem(sc);
                    break;
                case 2:
                    list.showList();
                    break;
                case 3:
                    list.updateItem(sc);
                    break;
                case 4:
                    list.deleteItem(sc);
                    break;
                case 5:
                    list.foundItem(sc);
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp. Hãy nhập từ 1 - 5");
            }
        }while (true);
    }
}
