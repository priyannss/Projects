package projects.libraryManagement2;

import java.util.ArrayList;

public class library {
    private static class BookDetails {
        String bookName;
        String Author;
        long bookId;
        int numberOfAvailableCopies;
    }

    private final ArrayList<BookDetails> Books;
    private static int totalBooks;
    private static int totalVarietyOfBooks;
    private static int totalIssuedBooks;

    public library() {
        this.Books = new ArrayList<>(10);
        totalBooks = 0;
        totalVarietyOfBooks = 0;
        totalIssuedBooks = 0;
    }

    void addBook(String bookName, String Author, long bookId, int numberOfCopies){
        for(BookDetails obj : Books) {
            if(obj.bookName.equalsIgnoreCase(bookName) && obj.Author.equalsIgnoreCase(Author)){
                obj.numberOfAvailableCopies += numberOfCopies;
                totalBooks += numberOfCopies;
                System.out.println(bookName + " book has been added.");
                System.out.println();
                return;
            }
        }
        BookDetails newBook = new BookDetails();
        newBook.bookName = bookName;
        newBook.Author = Author;
        newBook.bookId = bookId;
        newBook.numberOfAvailableCopies = numberOfCopies;
        this.Books.add(totalVarietyOfBooks++, newBook);
        System.out.println(bookName + " book has been added.");
        totalBooks += numberOfCopies;
        System.out.println();
    }

    void issueBook(String book) {
        for(BookDetails obj : Books) {
            if(obj.bookName.equalsIgnoreCase(book) && obj.numberOfAvailableCopies > 0) {
                System.out.println(book + " book is available.");
                obj.numberOfAvailableCopies--;
                totalBooks--;
                totalIssuedBooks++;
                System.out.println(book + " book has been issued!");
                System.out.println();
                return;
            }
        }
        System.out.println(book + " book is not available.");
        System.out.println();
    }

    void returnBook(String book, long bookId) {
        for(BookDetails obj : Books) {
            if(obj.bookName.equalsIgnoreCase(book) && obj.bookId == bookId && totalIssuedBooks > 0) {
                obj.numberOfAvailableCopies++;
                totalBooks++;
                totalIssuedBooks--;
                System.out.println("Thank you for returning the book on time");
                System.out.println();
                return;
            }
        }
        System.out.println("This book was not issued from our library, So we can't accept it.");
        System.out.println();
    }


    void showAvailableBooks() {
        if(totalBooks == 0) {
            System.out.println("Certainly no books is available right now.");
            System.out.println();
            return;
        }
        System.out.println("Total number of books are: " + totalBooks);
        System.out.println("Total different type of books are : " + totalVarietyOfBooks);
        System.out.println();
        System.out.println("These books are available in our library:");
        for (BookDetails book : Books) {
            System.out.println("* Book Name: " + book.bookName);
            System.out.println("* Author: " + book.Author);
            System.out.println("* Book ID: " + book.bookId);
            System.out.println("* Number of Available Copies: " + book.numberOfAvailableCopies);
            if(book.numberOfAvailableCopies == 0) {
                System.out.println("Certainly all our " + book.bookName + " books is either issued or out of stock.");
            }
            System.out.println();
        }
    }

}
