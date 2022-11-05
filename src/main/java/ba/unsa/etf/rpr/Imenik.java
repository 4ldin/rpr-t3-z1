package ba.unsa.etf.rpr;
import java.util.*;

public class Imenik {

    private  HashMap<String, TelefonskiBroj> map;

    public Imenik(HashMap<String, TelefonskiBroj> map){
        this.map = map;
    }
    public Imenik(){
        this.map = new HashMap<>();
    }
    public void dodaj(String ime, TelefonskiBroj broj){
        this.map.put(ime, broj);
    };
    public String dajBroj(String ime){
        return map.get(ime).ispisi();
    };
    public <TelefosnkiBroj> String dajIme(TelefosnkiBroj broj) throws IllegalAccessException {
        for(Map.Entry<String, TelefonskiBroj> entry : map.entrySet()){
            if(broj.equals(entry.getValue())) return entry.getKey();
        }
        throw new IllegalAccessException("Nema tog imena u imeniku");
    };
    public String naSlovo(char s) throws IllegalAccessException {
        String rez = "";
        int i = 1;
        for(Map.Entry<String , TelefonskiBroj> entry : map.entrySet()){
            String ime = entry.getKey();
            if(ime.charAt(0) == s) {
                rez +=  i + ". "  + entry.getKey() + " - " + entry.getValue().ispisi() + '\n';
                i++;
            }
        }
        if(rez.isEmpty()) throw new IllegalAccessException("Nema niti jedne osobe s tim slovom u imeniku.");
        return rez;
    };
    public Set<String> izGrada(Grad g) throws IllegalAccessException {
        Set<String> skup = new LinkedHashSet<>();
        for(Map.Entry<String , TelefonskiBroj> entry : map.entrySet()){
            if(entry.getValue() instanceof FiksniBroj)
                if(((FiksniBroj) entry.getValue()).dajGrad() == g) skup.add(entry.getKey());
        }
        List<String> tmp = new ArrayList<>(skup);
        Collections.sort(tmp);
        skup.addAll(tmp);
        if(skup.isEmpty()) throw new IllegalAccessException("Nema osobe iz tog grada.");

        return skup;
    };
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> skup = new LinkedHashSet<>();
        for(Map.Entry<String , TelefonskiBroj> entry : map.entrySet()){
            if(entry.getValue() instanceof FiksniBroj){
                if(((FiksniBroj) entry.getValue()).dajGrad() == g){
                    skup.add(entry.getValue());
                }
            }
        }
        List<TelefonskiBroj> tmp_1 = new ArrayList<TelefonskiBroj>(skup);
        List<String> tmp_2 = new ArrayList<>();
        for(TelefonskiBroj t : tmp_1){
            tmp_2.add(t.ispisi());
        }
        Collections.sort(tmp_2);
        Set<TelefonskiBroj> rez = new LinkedHashSet<>();
        for(String s : tmp_2){
            for(Map.Entry<String , TelefonskiBroj> entry : map.entrySet()){
                if(entry.getValue() instanceof FiksniBroj){
                    if(Objects.equals(((FiksniBroj) entry.getValue()).ispisi(), s)){
                        rez.add(entry.getValue());
                    }
                }
            }
        }
        return rez;
    }
}
