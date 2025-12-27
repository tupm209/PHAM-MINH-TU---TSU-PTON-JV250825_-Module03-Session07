package bai_2;

public class Book {
    private String title;
    private String author;
    private double price;

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Giá không được âm");
        }else{
            this.price = price;
        }
    }
}
