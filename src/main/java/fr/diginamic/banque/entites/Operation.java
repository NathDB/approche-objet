package fr.diginamic.banque.entites;

public abstract class Operation {
    String date;
    float montant;
    String type;

    public float getMontant() {
        return montant;
    }

    public Operation(String date, float montant) {
        this.date = date;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
    public abstract String afficherType();

}
