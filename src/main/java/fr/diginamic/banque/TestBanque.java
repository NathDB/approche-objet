package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args){
        Compte[] tab  = new Compte[2];
        tab[0] = new Compte(123456, 1200);
        tab[1] = new CompteTaux(999, 1500, 3);

        for (int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
