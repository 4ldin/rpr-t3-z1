package ba.unsa.etf.rpr;

public enum Grad {
    Sarajevo("033"), Bihac("037"), Gorazde("038");
    private String broj;
    Grad(String s) {
        this.broj = s;
    }
    public String ispisi(){
        return this.toString();
    }
}
