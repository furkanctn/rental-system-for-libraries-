package Proje;

// Student name : Furkan Çetin
// Student Number : 150119627
/*

    the program has only one purpose, that too,customers should rent books which are avaiable
 and then program has to get control for availables,one customer can only one book byself

 */
import java.lang.String;

public class Customer extends Person {
    private String address = "-";
    private BookClass borrowedBook;
    private boolean borrowABook;

    // // to describe constructor of Customer
    public Customer(String name, String birthPlace, int birthDate, String address) {
        super(name, birthDate, birthPlace);
        this.address = address;
    }
    // to describe constructor of Customer
    public Customer(String name, int birthDate, String address) {
        super(name,birthDate);
        this.address = address;
    }
    // to describe constructor of Customer
    public Customer(String name,int birthDate) {
        super(name,birthDate);
    }

    @Override

    // data printing toString method
    public String toString() {
        return ("Name: " + getName() + ", BirthDate: " + getBirthDate() + ", Birth Place:" + getBirthPlace() + ", Adress: " + address);
    }
}
