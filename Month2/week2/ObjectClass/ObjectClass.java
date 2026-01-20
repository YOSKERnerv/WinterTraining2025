class ObjectClass {
    public static void main(String[] args) {

        Book b1 = new Book("Java");
        Book b2 = new Book("Java");
        Book b3 = new Book("Python");

        System.out.println(b1.equals(b2)); // true
        System.out.println(b1.equals(b3)); // false
        System.out.println(b1.equals("Java")); // false (safe)
    }
}

class Book {
    String bname;

    Book(String bname) {
        this.bname = bname;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Book))
            return false;

        Book b = (Book) obj;   // downcasting
        return this.bname.equals(b.bname);
    }
}
