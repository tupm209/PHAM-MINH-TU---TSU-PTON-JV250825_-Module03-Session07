package bai_5;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductsList {
    private final ArrayList<Product> productList = new ArrayList<>();
    String id, name;
    double price;

    public void addItem(Scanner sc){
        boolean flag;
        do {
            flag = false;
            System.out.print("Nhập ID sản phẩm: ");
            id = sc.nextLine();
            for (Product product : productList) {
                if(product.getId().equals(id)){
                    System.out.println("ID đã tồn tại. Hãy nhập ID mới");
                    flag = true;
                    break;
                }
            }
        }while (flag);
        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        price = Double.parseDouble(sc.nextLine());
        productList.add(new Product(id, name, price));
        System.out.println("Sản phẩm đã được thêm");
    }

    public void showItemList(){
        if(productList.isEmpty()){
            System.out.println("Danh sách trống");
        }else{
            System.out.println("Danh sách sản phẩm");
            for (Product product : productList){
                System.out.println(product);
            }
        }
    }

    public void updateItem(Scanner sc){
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        id = sc.nextLine();
        boolean flag = false;
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.print("Nhập tên mới: ");
                name = sc.nextLine();
                product.setName(name);
                System.out.print("Nhập giá mới: ");
                price = Double.parseDouble(sc.nextLine());
                product.setPrice(price);
                System.out.println("Sản phẩm đã được cập nhật");
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println("Sản phẩm không tồn tại");
        }
    }

    public void deleteItem(Scanner sc){
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        id = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                productList.remove(i);
                System.out.println("Sản phẩm đã được xóa");
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("Sản phẩm không tồn tại");
        }
    }
}
