package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args){
        AdressePostale adresse1 = new AdressePostale(1, "Rue Blabla", 44000, "Nantes");
        AdressePostale adresse2 = new AdressePostale(16, "Rue Bloblo", 85000, "BLO");
        System.out.println(adresse1);
        System.out.println(adresse2);
    }
}
