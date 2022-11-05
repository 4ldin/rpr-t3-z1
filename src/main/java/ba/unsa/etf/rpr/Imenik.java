package ba.unsa.etf.rpr;
import java.util.*;

public class Imenik {

    private HashMap<String, TelefonskiBroj> map;
    public Imenik(HashMap<String, TelefonskiBroj> map){
        this.map = map;
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        this.map.put(ime, broj);
    };
    public String dajBroj(String ime){
        return map.get(ime).ispisi();
    };
    public <TelefosnkiBroj> String dajIme(TelefosnkiBroj broj){
        return map.get(broj).ispisi();
    };
    public String naSlovo(char s){
        String rez = "";
        for(Map.Entry<String , TelefonskiBroj> entry : map.entrySet()){
            String ime = String.valueOf(entry.getValue());
            if(ime.charAt(0) == 's') rez += ime;
        }
        return rez;
    };
    public Set<String> izGrada(Grad g){
        Set<String> skup = new LinkedHashSet();
        for()

    };
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> skup = new LinkedHashSet();
        for()
    }
}
