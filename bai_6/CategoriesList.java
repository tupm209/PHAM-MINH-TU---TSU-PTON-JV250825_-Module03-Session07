package bai_6;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoriesList {
    ArrayList<Category> categoryArrayList = new ArrayList<>();
    String id, name, description, foundKey;

    public boolean isIdExisted(String id){
        for(Category category : categoryArrayList){
            if(category.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public void addItem(Scanner sc){
        do {
            System.out.print("Nhập ID danh mục: ");
            id = sc.nextLine();
            if (isIdExisted(id)){
                System.out.println("ID đã tồn tại. Hãy nhập ID mới");
            }else{
                break;
            }
        }while(true);
        System.out.print("Nhập tên danh mục: ");
        name = sc.nextLine();
        System.out.print("Nhập mô tả danh mục: ");
        description = sc.nextLine();
        categoryArrayList.add(new Category(id, name, description));
        System.out.println("Danh mục đã được thêm");
    }

    public void showList(){
        if (categoryArrayList.isEmpty()){
            System.out.println("Dữ liệu trống");
        }else{
            System.out.println("Danh sách danh mục");
            for (Category category : categoryArrayList){
                System.out.println(category);
            }
        }
    }

    public void updateItem(Scanner sc){
        System.out.print("Nhập ID danh mục cần cập nhật: ");
        id = sc.nextLine();
        if(!isIdExisted(id)){
            System.out.println("ID không tồn tại. Hãy nhập lại");
        }else{
            for (Category category : categoryArrayList) {
                if (category.getId().equals(id)) {
                    System.out.print("Nhập tên mới: ");
                    name = sc.nextLine();
                    category.setName(name);
                    System.out.print("Nhập mô tả mới: ");
                    description = sc.nextLine();
                    category.setName(name);
                    System.out.println("Danh mục đã được cập nhật");
                    break;
                }
            }
        }
    }

    public void deleteItem(Scanner sc){
        System.out.print("Nhập ID danh mục cần xóa: ");
        id = sc.nextLine();
        if(!isIdExisted(id)){
            System.out.println("ID không tồn tại. Hãy nhập lại");
        }else{
            for (int i = 0; i < categoryArrayList.size(); i++) {
                if(categoryArrayList.get(i).getId().equals(id)){
                    categoryArrayList.remove(i);
                    System.out.println("Đã xóa danh mục");
                    break;
                }

            }
        }
    }

    public void foundItem(Scanner sc){
        boolean flag = false;
        System.out.print("Nhập tên danh mục cần tìm: ");
        foundKey = sc.nextLine();
        System.out.println("Danh sách danh mục khớp tên: ");
        for (Category category : categoryArrayList) {
            if (category.getName().contains(foundKey)) {
                System.out.println(category);
                flag = true;
            }
        }

        if(!flag){
            System.out.println("Không thấy danh mục");
        }
    }
}
