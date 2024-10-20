public class Book1{
    private String name;
    private Author author; // Mảng các đối tượng Author
    private double price;
    private int qty = 0; // Mặc định là 0 nếu không truyền vào

    public Book1(String name, Author authors, double price) {
        this.name = name;
        this.author = authors;
        this.price = price;
    }

    public Book1(String name, Author authors, double price, int qty) {
        this.name = name;
        this.author = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthors() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "'" + name + "' by " + author;  // Sử dụng phương thức toString của Author
    }

}
