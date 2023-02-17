package minibookstore;
// 1a:  tum urunlerin ortak ozellikleri ve methodlari
public class Product {

    private  static int count = 0;
    private  int id;
    private  String name;
    private  String price;
    private  int stock;

    public Product(String name, String price, int stock) {

        count++;
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
