package Proje;
// Student name : Furkan Çetin
// Student Number : 150119627
/*

    the program has only one purpose, that too,customers should rent books which are avaiable
 and then program has to get control for availables,one customer can only one book byself

 */
public class BookClass {

    public int id;
    public String title;
    public Author author;
    public boolean borrowed;

    // to describe constructor of BookClass
    public BookClass(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }
    // to describe constructor of other BookClass
    public BookClass(int id, String title) {
        this.id = id;
        this.title = title;
        this.borrowed = false;

    }
//                        I have defined getter and setter methods to use them in class.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public boolean isBorrowed(){
        return borrowed;
    }
    public boolean borrowed(){
        return borrowed;
    }
    public boolean returned(){
        return borrowed;

    }

    //method of printing the given information
    public String toString(){
        return ("Book name is: " + title + ", Author: " + author);
    }
}
