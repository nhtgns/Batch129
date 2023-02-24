package otel;

public class AileOdasi extends Otel{

    public AileOdasi() {
    }

    public AileOdasi(String musteriAdi, String musteriSoyadi, int yas, String cinsiyet, int geceSayisi, int ucret) {
        super(musteriAdi, musteriSoyadi, yas, cinsiyet, geceSayisi, ucret);
    }

    @Override
    public String toString() {
        return "AileOdasi{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", geceSayisi=" + geceSayisi +
                ", ucret=" + ucret +
                '}';
    }
}
