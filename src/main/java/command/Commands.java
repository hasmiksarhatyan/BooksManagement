package command;

public interface Commands {
    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHORE_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printLoginCommand() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + LOGIN + " for login");
        System.out.println("please input " + REGISTER + " for register");
    }

    static void printAdminCommand() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHORE_NAME + " for print books by author name");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + PRINT_ALL_AUTHOR + " for print all author");

    }
    static void printUserCommand() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHORE_NAME + " for print books by author name");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("please input " + PRINT_ALL_AUTHOR + " for print all author");

    }
}
