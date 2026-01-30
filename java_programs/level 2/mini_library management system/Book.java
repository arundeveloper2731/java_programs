class Book {

    int bookId;
    String title;
    String author;
    boolean isAvailable;   

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (isAvailable ? "Available" : "Borrowed"));
        
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book already borrowed");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully");
    }
}
