package essais;

import entites.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne personne1 = new Personne('BLO', 'blo');
        Personne personne2 = new Personne('BLA', 'bla');
        System.out.println(personne1);
        System.out.println(personne2);
    }
}
