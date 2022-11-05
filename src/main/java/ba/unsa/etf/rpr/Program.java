package ba.unsa.etf.rpr;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        HashMap<String, TelefonskiBroj> map = new HashMap<>();

        TelefonskiBroj broj_1 = new MobilniBroj(62, "987-654");
        TelefonskiBroj broj_2 = new MedunarodniBroj("+387", "678-897");
        TelefonskiBroj broj_3 = new FiksniBroj(Grad.Breza, "+387");
        broj_1.ispisi();
        broj_2.ispisi();
        Imenik imenik = new Imenik(map);
        imenik.dodaj("Ime Prezime", broj_1);
        imenik.dodaj("surname name", broj_2);
        try {
            System.out.println(imenik.dajIme(broj_1));
            System.out.println(imenik.dajIme(broj_2));
            imenik.dodaj("Test test", broj_3);
            System.out.println(imenik.izGrada(Grad.Breza));
            System.out.println(imenik.naSlovo(('s')));
            System.out.println(imenik.izGradaBrojevi(Grad.Konjic));
        } catch (IllegalAccessException error) {
            System.out.println(error);
        }

    }
}
