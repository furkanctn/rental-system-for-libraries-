package Proje;
// Student name : Furkan Çetin
// Student Number : 150119627
/*

    the program has only one purpose, that too,customers should rent books which are avaiable
 and then program has to get control for availables,one customer can only one book byself

 */

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;

public class Library {
    public String addres;
    // to keep names of books and customers from Arraylists
    public ArrayList<BookClass> books;
    public ArrayList<Customer> customers;

    // to describe constructor of Library
    public Library(String addres, ArrayList<BookClass> books, ArrayList<Customer> customers) {
        this.addres = addres;
        this.books = books;
        this.customers = customers;
        this.books = new ArrayList<BookClass>();
        this.customers = new ArrayList<Customer>();
    }

    public Library(String addres) {
        this.addres = addres;
        this.books = new ArrayList<BookClass>();
        this.customers = new ArrayList<Customer>();

    }

    //                        I have defined getter and setter methods to use them in class.
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public ArrayList<BookClass> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<BookClass> books) {
        this.books = books;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public static void printOpeningHour() {

        System.out.println("Libraries are open daily from 9 am to 5 pm.");
    }
    //

   //  method of printing the library's working hours
    public void printAddress() {

        System.out.println(addres);
    }
    // method of adding a new book inside the list of books
    public boolean addBook(BookClass book) {
        books.add(book);
        return true;
    }
    // method of adding a new customer inside the list of customerss
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
   // to check availables books for  the customer borrow
    public void showDescription(boolean isCustomerFind, boolean isBookFind, boolean isbook, boolean isfindbook, String customerName, String bookname) {
        if (isCustomerFind == true) {
            if (isbook == true) {
                if (isBookFind == true) {
                    if (isfindbook == true) {
                        System.out.println(customerName + " succesfully borrowed " + bookname);
                    } else {
                        System.out.println("Sorry, this book already borrowed");
                    }
                } else {
                    System.out.println("Sorry, this book is not in our catalog");
                }
            } else {
                System.out.println("Sorry " + customerName + " already borrowed a book");
            }
        } else {
            System.out.println("Sorry," + customerName + "is not a customer");
        }

    }

    public boolean borrowBook(String bookname, String customerName) {
        boolean isCustomerFind = false;
        boolean isBookFind = false;
        boolean isbook = false;
        boolean isfindbook = false;

        for (Customer name : customers) {
            if (name.getName().equals(customerName)) {
                // available to customer
                isCustomerFind = true;
                if ((name.isBorrowedBook() == false)) {
                    // available to borrow books
                    isbook = true;
                    for (BookClass item : books) {
                        // data matches book list
                        if (item.getTitle().equals(bookname)) {
                            isBookFind = true;
                            if ((item.borrowed == false)) {
                                isfindbook = true;
                                item.borrowed = true;
                                name.setBorrowedBook(true);
                                showDescription(isCustomerFind, isBookFind, isbook, isfindbook, customerName, bookname);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        // to call showDescription methods which are defined
        showDescription(isCustomerFind, isBookFind, isbook, isfindbook, customerName, bookname);
        return false;
    }

    // checking suitability to return the book
    public void returnBook(String personName) { //
        // to define boolean method
        boolean cust = false;
        boolean id = false;

        for (Customer name : customers) {
            if (name.getName().equals(personName)) {
                // data matches the data in the customer list
                id = true;
                if ((name.isBorrowedBook() == true)) {
                    cust = true;
                    name.setBorrowedBook(false);
                    break;
                }
            }
        }
        if (id == true) {
            if (cust == true) {
                System.out.println(personName + " Succesfully returned");
            } else {
                System.out.println("Sorry" + personName + " did not a barrow");
            }
        } else {
            System.out.println("Sorry" + personName + " is not a customer");
        }
    }

    // method of printing a list of suitable books available for purchase
    public void printAvailableBooks() {
        boolean available_book = false;
        for (BookClass book : books) {
            if (book.isBorrowed() == false) {
                System.out.println("Book name is " + book.getTitle() + ", Author is " + book.getAuthor());
                available_book = true;
            }
        }
        if (!available_book){
            System.out.println("No book in catalog");
        }

    }

    @Override
    // overriding to string method
    public String toString() {
        return super.toString();
    }


}
