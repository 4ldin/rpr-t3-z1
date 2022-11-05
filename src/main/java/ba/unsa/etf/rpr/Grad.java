package ba.unsa.etf.rpr;

public enum Grad {
    SARAJEVO("033"), Bihac("037"), Gorazde("038"), Konjic("036"), Breza("032");
    private String broj;
    Grad(String s) {
        this.broj = s;
    }
    public String ispisi(){
        return broj;
    }
}
