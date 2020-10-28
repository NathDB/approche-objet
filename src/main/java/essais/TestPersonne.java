package essais;

import entites.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne personne1 = new Personne("BLO", "blo", "1 Rue de Blo");
        Personne personne2 = new Personne("BLA", "bla", "3 Rue de Bla");
        System.out.println(personne1);
        System.out.println(personne2);
        personne1.afficherPersonne(personne1);
        personne1.setNom("toto");
    }
}
