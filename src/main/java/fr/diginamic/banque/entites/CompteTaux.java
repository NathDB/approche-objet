package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    int taux;

    public CompteTaux(int numCompte, int solde, int taux) {
        super(numCompte, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() +
                " taux=" + taux +
                '}';
    }
}
