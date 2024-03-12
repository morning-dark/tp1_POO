public abstract class Compte {
    private int code ;
    private double solde ;
    //private static int nbrCompte ;


    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

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
