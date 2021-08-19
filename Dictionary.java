package Proje;

// Student name : Furkan Çetin
// Student Number : 150119627
/*

    the program has only one purpose, that too,customers should rent books which are avaiable
 and then program has to get control for availables,one customer can only one book byself

 */
// attributes of id,title and Author coming from BookClass class.Author class has only definations
public class Dictionary extends BookClass {
    private int definations;

    // to describe constructor of Dictionary
    public Dictionary(int id, String title, Author author, int definations) {
        super(id, title, author);
        this.definations = definations;
    }

    // to describe constructor of other Dictionary
    public Dictionary(int id, String title, int definations) {
        super(id, title);
        this.definations = definations;
    }

    //                        I have defined getter and setter methods to use them in class.
    public int getDefinations() {
        return definations;
    }

    public void setDefinations(int definations) {
        this.definations = definations;
    }

    public String toString() {
        return ("Dictionary name is: " + getTitle() + " ,Definations: " + definations);
    }
}
