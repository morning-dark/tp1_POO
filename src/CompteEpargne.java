public class CompteEpargne extends Compte{
    private double taux ; // 10%, 3%

    public CompteEpargne(double taux) {
        super();
        this.taux = taux;
    }

    public CompteEpargne(int code, double taux) {
        super(code);
        this.taux = taux;
    }

    public CompteEpargne(int code, double solde, double taux) {
        super(code, solde);
        this.taux = taux;
    }

    // call ones in year
    public void calculInterets(){
        setSolde(getSolde()+getSolde()*taux);
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "taux=" + taux +
                "} " + super.toString();
    }
}
