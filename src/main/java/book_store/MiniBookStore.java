package book_store;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Proje: Mini Book Store
        Online bir kitap market için ürün yönetim uygulaması yapınız.
        Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

        Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
        Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu

        Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
        Kullanıcı kategoriye göre ürün ekleyebilmeli,ürün mevcutsa uyarı verilmeli
        Kullanıcı ürünleri benzersiz numaralarına(id) göre silebilmeli.

        NotebookService:ÖDEV
        updateProduct:opsitonel ödev

        */
public class MiniBookStore implements ProductService{
    static Scanner input = new Scanner(System.in);
    List<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        MiniBookStore miniBook = new MiniBookStore();
        miniBook.kitapDepo();
        miniBook.menuGoster();
    }


    public void menuGoster(){

        int tercih =0;
        do {

            System.out.println("Martı Kitabevine Hoşgeldiniz");
            System.out.println("" +
                    "\n Kitapları listele    1" +
                    "\n Kitap ekle           2" +
                    "\n Kitap sil            3" +
                    "\n Kitap arama          4" +
                    "\n Çıkış                0"

            );
            System.out.println("Terhichiniz :");
            tercih = input.nextInt();


            switch (tercih) {
                case 1:
                    listele();
                    break;
                case 2:
                    ekleme();
                    break;
                case 3:
                    silme();
                    break;
                case 4:
                    arama();
                    break;
                case 0:
                    System.out.println("sistemden cıktınız");
                    break;
                default:
                    System.out.println("Yanlıs girdiniz");
            }
        }while (tercih !=0);

    }

    public void kitapDepo(){

        Book kitap1 = new Book("Sefiller", "100", "15", "Victor Hugo", "Pelikan", "VHG");
        Book kitap2 = new Book("Suc ve Ceza", "150", "10", "Dostoyevski", "Doğu", "DSTY");
        Book kitap3 = new Book("Savaş ve Barış", "200", "5", "Tolstoy", "Martı", "TLSY");

        books.add(kitap1);
        books.add(kitap2);
        books.add(kitap3);


    }

    @Override
    public  void listele() {
        System.out.println("Id No :   Kitap adı      :  Fiyatı    :");
        System.out.println("=======   ===============   =========== ");
        for (Book w : books) {
            System.out.printf("%-10s %-16s %-5s \n", w.getId(), w.getName(),w.getPrice());
            System.out.println("====================================================");
        }

    }

    @Override
    public void ekleme() {
        input.nextLine();

        System.out.println("ISBN numarasını giriniz");
        String isbnNum = input.next();
        for (Book book : books) {

            //for(int i = 0; i <books.size(); i++) {
            if (book.getIsbn().equals(isbnNum)) {
                System.out.println("Bu kitap stokta var. Eklemeyapılamaz");
                break;
            } else {
                input.nextLine();
                System.out.println("Kitabın adını giriniz");
                String ad = input.nextLine();

                System.out.println("Fiyatı giriniz");
                String fiyat = input.nextLine();

                System.out.println("Stok durumu");
                String stok = input.nextLine();
                System.out.println("Yazar");
                String yazar = input.nextLine();

                System.out.println("Yayınevi ");
                String yayEvi = input.nextLine();
                System.out.println("ISBN");
                String isbn = input.nextLine();

                Book newBook = new Book(ad, fiyat, stok, yazar, yayEvi, isbn);
                books.add(newBook);
                break;

            }
        }

    }

    @Override
    public void silme() {
        input.nextLine();
        System.out.println("ISBN numarasını giriniz");
        String isbn= input.nextLine();

        for ( Book w: books){
            if (w.getIsbn().equalsIgnoreCase(isbn)){
                books.remove(w);
                break;
            }else {
                System.out.println("Hatalı ISBN girdiniz");
                break;
            }

        }



    }

    @Override
    public void arama() {
        input.nextLine();

        System.out.println("ISBN giriniz");
        String isbn= input.nextLine();

        for ( Book w: books){
            if (w.getStokDurumu().equalsIgnoreCase(isbn)){
                System.out.println("Kitap bulundu ");
                break;
            }else{
                System.out.println("Aradığınız yazarın eseri mevcut değildir");
                break;
            }
        }

    }
}
