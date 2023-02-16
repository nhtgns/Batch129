package minibookstore;
//2a-  bookla ilgili islemler

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService {
    Scanner input = new Scanner(System.in);
    List<Book> books = new ArrayList<>();

    public  BookService(){
        Book book1 = new Book("Fareler ve Insanlar", "120 Lira", 15, "J.steinbeck", "Penguin", "A111");
        Book book2=new Book("Sefiller","150 Lira",5,"V.Hugo","Penguin","A222");
        Book book3=new Book("Suç ve Ceza","120 Lira",15,"Dostoyevski","Dream","A333");

        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);

    }

    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println("......................");
            System.out.println("1.  kitaplari listeleme");
            System.out.println("2.  kitap ekleme");
            System.out.println("3.  Kitap sil");
            System.out.println("4.  yayinevine gore filtreleme");
            System.out.println("0.  geri don");
            System.out.println("    Seciminiz");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("yayievi");
                    String publisher = input.nextLine();
                    filterProduct(publisher);
                    break;
                case 0:
                    System.out.println("Ana menuye yonlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");
                    break;


            }
        } while (choice != 0);

    }
    //6- kitaplari formatla yazdiralim

    @Override
    public void listProduct() {


    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProduct(String filter) {

    }
}
