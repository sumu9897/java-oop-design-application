class Book {
    private String bookId;
    private String title;
    private int availableCopies;

    public Book(String bookId, String title, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.availableCopies = availableCopies;
    }

    public void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            System.out.println("Error: No copies available");
        }
    }

    public void returnBook() {
        availableCopies++;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Available Copies: " + availableCopies);
    }

    public static void main(String[] args) {
        Book b = new Book("B301", "Java Programming", 2);
        b.issueBook();
        b.returnBook();
        b.displayBookInfo();
    }
}
