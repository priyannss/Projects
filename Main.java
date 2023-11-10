package projects.libraryManagement2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Osprey Library");
        library Osprey = new library();

        int choice;
        do{
            System.out.println("Choices:");
            System.out.println("1. Add Some Books");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Show available books");
            System.out.println("5. Exit from library");
            System.out.print("Enter your choice : ");
            choice = in.nextInt();
            System.out.println();

            switch (choice) {
                case 1-> {
                    System.out.println("Fill all the details:");
                    System.out.print("Book name: ");
                    in.nextLine();
                    String bookName = in.nextLine();
                    System.out.print("Author: ");
                    String author = in.nextLine();
                    System.out.print("Book Id: ");
                    long bookId = in.nextLong();
                    System.out.print("Number of copies: ");
                    int noOfCopies = in.nextInt();
                    System.out.println();
                    Osprey.addBook(bookName, author, bookId, noOfCopies);
                }

                case 2-> {
                    System.out.println("Which book are you looking for");
                    System.out.print("Book name: ");
                    in.nextLine();
                    String bookName = in.nextLine();
                    System.out.println();
                    Osprey.issueBook(bookName);
                }

                case 3-> {
                    System.out.println("Enter book details for returning  the book");
                    System.out.print("Book name: ");
                    in.nextLine();
                    String bookName = in.nextLine();
                    System.out.print("Book Id: ");
                    long bookId = in.nextLong();
                    System.out.println();
                    Osprey.returnBook(bookName, bookId);
                }

                case 4-> Osprey.showAvailableBooks();

                case 5-> {
                    System.out.println("Thank you for visiting Osprey library.");
                    System.out.println("Exiting...");
                    in.close();
                }

                default -> System.out.println("Invalid choice! please enter the correct one.");
            }

        } while(choice != 5);

    }
}
