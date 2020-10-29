package fr.diginamic.banque.entites;

public class Compte {
    int numCompte;
    int solde;

    public Compte(int numCompte, int solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }
}
