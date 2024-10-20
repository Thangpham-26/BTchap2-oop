public class TestBook1 {
    public static void main(String[] args) {
        // Tạo đối tượng Author
        Author author = new Author("J.K. Rowling", "jkrowling@gmail.com", 'f');

        // Tạo đối tượng Book với tác giả là đối tượng Author
        Book1 book = new Book1("Harry Potter", author, 29.99, 100);

        // In thông tin của cuốn sách
        System.out.println(book);

        // Thay đổi giá sách và in lại thông tin
        book.setPrice(24.99);
        book.setQty(50);
        System.out.println("Updated Book: " + book);
    }
}
