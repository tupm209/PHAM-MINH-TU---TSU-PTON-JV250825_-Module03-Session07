package bai_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductsList list = new ProductsList();
        int choice;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    list.addItem(sc);
                    break;
                case 2:
                    list.showItemList();
                    break;
                case 3:
                    list.updateItem(sc);
                    break;
                case 4:
                    list.deleteItem(sc);
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp. Hãy nhập từ 1 - 5");
            }
        }while (true);
    }
}
