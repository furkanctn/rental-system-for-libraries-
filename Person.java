package Proje;
// Student name : Furkan Çetin
// Student Number : 150119627
/*

    the program has only one purpose, that too,customers should rent books which are avaiable
 and then program has to get control for availables,one customer can only one book byself

 */
public class Person {
    private String name;
    private int birthDate;
    private String birthPlace ="-";
    private boolean isBorrowedBook;

    // to describe constructor of Person
    public Person(String name, int birthDate, String birthPlace) {
        this.name = name;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.isBorrowedBook = false;
    }
    // to describe constructor of Person
    public Person(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.isBorrowedBook = false;
    }
    //                        I have defined getter and setter methods to use them in class.
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public boolean isBorrowedBook() {
        return isBorrowedBook;
    }

    public void setBorrowedBook(boolean borrowedBook) {
        isBorrowedBook = borrowedBook;
    }
    // data printing toString method
    public String toString(){

        return ("Name: "+name+", "+", Birth Place: "+ birthPlace+"Birth Date: " +birthDate  );

    }
}
