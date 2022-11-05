package ba.unsa.etf.rpr;

public class FiksniBroj  extends TelefonskiBroj{
    private String broj;
    private Grad grad;
    FiksniBroj(Grad grad, String broj){
        this.broj = broj;
        this.grad = grad;
    }
    public Grad dajGrad(){
        return grad;
    }
    public String dajBroj(){
        return broj;
    }
    @Override
    public String ispisi() {
        return grad.ispisi() + '/' + broj;
    }
    @Override
    public int hashCode() {
        return grad.hashCode();
    }

}
