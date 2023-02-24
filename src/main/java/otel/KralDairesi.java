package otel;

public class KralDairesi extends Otel{
    public KralDairesi() {
    }

    public KralDairesi(String musteriAdi, String musteriSoyadi, int yas, String cinsiyet, int geceSayisi, int ucret) {
        super(musteriAdi, musteriSoyadi, yas, cinsiyet, geceSayisi, ucret);
    }

    @Override
    public String toString() {
        return "KralDairesi{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", geceSayisi=" + geceSayisi +
                ", ucret=" + ucret +
                '}';
    }
}
