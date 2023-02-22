package book_store;

public class Product {
    static int count=0;
    int id;
    String name;

    String price;
    String stokDurumu;

    public Product() {
    }


    public Product(String name, String price, String stokDurumu) {
        count++;
        this.id=count;
        this.name = name;
        this.price = price;
        this.stokDurumu = stokDurumu;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStokDurumu() {
        return stokDurumu;
    }

    public void setStokDurumu(String stokDurumu) {
        this.stokDurumu = stokDurumu;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stokDurumu=" + stokDurumu +
                '}';
    }
}
