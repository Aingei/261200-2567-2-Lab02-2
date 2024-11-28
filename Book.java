public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }

    public void updatePrice(double newPrice) {
        if(newPrice>0){
            price = newPrice;
        }else{
            System.out.println("Price cannot be negative. Set price to 0");
        }
    }

    public void applyDiscount(double discountPer){
        if(discountPer >0.00 && discountPer <100.00){
            this.price = price -(price*(discountPer/100));
            System.out.println("percentage discount applied and updated price");

        }else{
            System.out.println("Invalid discount percentage do not update the price.");
        }
    }

}

