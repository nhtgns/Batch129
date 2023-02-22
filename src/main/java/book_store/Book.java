package book_store;

public class Book extends Product{
    private String yazaradi;
    private String yayinEvi;
    private String isbn;

    public Book() {
    }

    public Book(String name, String price, String stokDurumu, String yazaradi, String yayinEvi, String isbn) {
        super(name, price, stokDurumu);
        this.yazaradi = yazaradi;
        this.yayinEvi = yayinEvi;
        this.isbn = isbn;
    }

    public String getYazaradi() {
        return yazaradi;
    }

    public void setYazaradi(String yazaradi) {
        this.yazaradi = yazaradi;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "yazaradi='" + yazaradi + '\'' +
                ", yayinEvi='" + yayinEvi + '\'' +
                ", isbn='" + isbn + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stokDurumu='" + stokDurumu + '\'' +
                '}';
    }
}
