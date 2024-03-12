import java.util.ArrayList;
import java.util.List;

public class Programme {
    public static void main(String[] args) {

        CompteSimple c1 = new CompteSimple(12, 3000);
        CompteSimple c2 = new CompteSimple(22, 3000);
        CompteSimple c3 = new CompteSimple(3, 3000);
        // ...... //
        CompteEpargne cp1 = new CompteEpargne(20, 10000);
        CompteEpargne cp2 = new CompteEpargne(2, 100000);

        List<Compte> comptes = new ArrayList<>();
        comptes.add(c1);
        comptes.add(c2);
        comptes.add(c3);
        comptes.add(cp1);
        comptes.add(cp2);

        double somme = 0 ;
        for (Compte c : comptes)
            somme+= c1.getSolde();

    }
}
