
import java.util.Scanner;
/*
You have to implement a library using Java class "Library".

Methods:
addBook
issueBook
returnBook
showAvailableBooks

Properties:
Array to store the available books
Array to store the issued books
 */

class Library {
    String[] availableBooks;
    String[] issuedBooks;

    int availCount;
    int issuedCount;

    Library() {
        availableBooks = new String[100];
        issuedBooks = new String[100];

        availCount = 0;
        issuedCount = 0;
    }

    public void addBook(String book) {

        for (int n =0; n<availCount;n++) {
            if (availableBooks[n].equalsIgnoreCase(book)) {
                System.out.println("you have added this book already.");
                return;
            }
        }
        if (availableBooks.length == availCount) {
            System.out.println("There is no space in library to add more book.");
        } else {
            availableBooks[availCount] = book;
            availCount++;
            System.out.println(book + " added to Library.");
        }
    }

    public void issueBook(String book) {
        // Check if book is already issued
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i].equalsIgnoreCase(book)) {
                System.out.println(book + " is already issued to someone.");
                return;
            }
        }

        for (int i = 0; i < availCount; i++) {
            if (availableBooks[i] != null && availableBooks[i].equalsIgnoreCase(book)) {
                System.out.println(book + " book is issued to you.");

                //add to issued book list
                issuedBooks[issuedCount] = book;
                issuedCount++;

                //remove from available book
                for (int j = i; j < availCount - 1; j++) {
                    availableBooks[j] = availableBooks[j + 1];
                }
                availableBooks[availCount - 1] = null;
                availCount--;
                return;
            }
        }
        System.out.println("This book is not available.");
    }

    public void returnBook(String book) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i] != null && issuedBooks[i].equalsIgnoreCase(book)) {
                System.out.println(book + " returned.");

                for (int j = i; j < issuedCount - 1; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }
                issuedBooks[issuedCount - 1] = null;
                issuedCount--;

                addBook(book);
                return;

            }
        }
        System.out.println("This book was not issued.");
    }

    public void showAvailableBooks() {

        if(availCount==0){
            System.out.println("There is no book available in the library.");
            return;
        }

        System.out.println("Available Book List");
        for (int i = 0; i < availCount; i++) {
            if (availableBooks[i] != null) {
                System.out.println(availableBooks[i]);
            }
        }
    }

    public void showIssuedBooks() {

        if(issuedCount==0){
            System.out.println("There is no issued book.");
            return;
        }

        System.out.println("Issued Book List");
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i] != null) {
                System.out.println(issuedBooks[i]);
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("WELCOME! To Library");
        Scanner sc = new Scanner(System.in);
        Library l1 = new Library();
        while (true) {
            System.out.println("Enter 1 for add books");
            System.out.println("Enter 2 for return books");
            System.out.println("Enter 3 for the issue book ");
            System.out.println("Enter 4 for the Available book list");
            System.out.println("Enter 5 for issued book list");
            System.out.println("Enter 6 for Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of book that you want to add");
                    int number = sc.nextInt();
                    sc.nextLine();
                    for (int k = 0; k < number; k++) {
                        System.out.println("Enter the name of book " + (k + 1));
                        String book_name = sc.nextLine();
                        l1.addBook(book_name);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of book you want to return");
                    int number1 = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < number1; i++) {
                        System.out.println("Enter the name of book " + (i + 1));
                        String book_name1 = sc.nextLine();
                        l1.returnBook(book_name1);
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of book you want to issue");
                    int number2 = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < number2; i++) {
                        System.out.println("Enter the name of book " + (i + 1));
                        String book_name1 = sc.nextLine();
                        l1.issueBook(book_name1);
                    }
                    break;
                case 4:
                    l1.showAvailableBooks();
                    break;
                case 5:
                    l1.showIssuedBooks();
                    break;
                case 6:
                    sc.close();
                    return;
            }



        }

    }

}