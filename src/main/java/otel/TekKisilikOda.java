package otel;

public class TekKisilikOda extends Otel{
    public TekKisilikOda() {
    }

    public TekKisilikOda(String musteriAdi, String musteriSoyadi, int yas, String cinsiyet, int geceSayisi, int ucret) {
        super(musteriAdi, musteriSoyadi, yas, cinsiyet, geceSayisi, ucret);
    }

    @Override
    public String toString() {
        return "TekKisilikOda{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", geceSayisi=" + geceSayisi +
                ", ucret=" + ucret +
                '}';
    }
}
