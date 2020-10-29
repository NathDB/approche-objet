package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.sql.SQLOutput;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] tab = new Operation[4];
        float montantGlobal;
        tab[0] = new Credit("01/10/2020", 150000);
        tab[1] = new Credit("03/04/2000", 123000);
        tab[2] = new Debit("28/09/2018", 199000);
        tab[3] = new Debit("19/05/2019", 100000);

        for (int i=0;i<tab.length;i++){
            System.out.println(tab[i] + tab[i].afficherType());
        }
        montantGlobal = tab[0].getMontant() + tab[1].getMontant() - tab[2].getMontant() - tab[3].getMontant();
        System.out.println("Montant : " + montantGlobal);

    }
}
