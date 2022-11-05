package ba.unsa.etf.rpr;

public class FiksniBroj  extends TelefonskiBroj{
    private String broj;
    private Grad grad;
    @Override
    public String ispisi() {
        return grad.ispisi() + '/' + broj;
    }
    @Override
    public int hashCode() {
        return grad.hashCode();
    }
    FiksniBroj(Grad grad, String broj){
        this.broj = broj;
        this.grad = grad;
    }
}
