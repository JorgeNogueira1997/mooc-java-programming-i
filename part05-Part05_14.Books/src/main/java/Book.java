
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object x) {

        if (this == x) {
            return true;
        }

        if (!(x instanceof Book)) {
            return false;
        }

        Book aux = (Book) x;

        if (this.name.equals(aux.name)
                && this.publicationYear == aux.getPublicationYear()) {
            return true;
        }

        return false;
    }

}
