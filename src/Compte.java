public class Compte {
    private int code ;
    protected double solde ;
    //private static int nbrCompte ;

    public Compte() {
        code = 1;
        solde = 100 ;
    }

    public Compte(int code) {
        this.code = code;
        solde = 0 ;
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public void verser(double somme){
        solde+=somme;
    }

    public void retirer(double somme){
        if(somme <= solde){
            solde-=somme;
        }
    }

    @Override
    public String  toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
