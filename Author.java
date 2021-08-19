package Proje;
// Student name : Furkan Çetin
// Student Number : 150119627
/*

    the program has only one purpose, that too,customers should rent books which are avaiable
 and then program has to get control for availables,one customer can only one book byself

 */

// attributes of name,birthdate and birthplace coming from person class.Author class has only publisher
public class Author extends Person {

    private String publisher;

    // to describe constructor of author
    public Author(String name,  String publisher,int birthDate) {
        super(name, birthDate);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String toString( ) {
        return (getName()+", "+"Birth Date: " +getBirthDate() + ", Birth Place: "+ getBirthPlace() + ", Publisher: " + publisher );
    }
}
