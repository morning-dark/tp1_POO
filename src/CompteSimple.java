public class CompteSimple extends Compte{

    private double decouvert;
    public CompteSimple() {
        super();
        this.decouvert = 1000;
    }

    public CompteSimple(int code, double decouvert) {
        super(code);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double somme) {
        if(somme <= getSolde() + decouvert){
            setSolde(getSolde() -somme);
        }
    }

    @Override
    public String toString() {
        return "CompteSimple{" +
                "decouvert=" + decouvert +
                "} " + super.toString();
    }
}
