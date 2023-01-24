package Presentation;

import Metier.IMetierImpl;
import dao.DaoImpl;


public class Presenatation {
    public static void main(String[] args) {
        /*
        injection des dépendences par
        instanciation statique => new
        dans une programmation de qualité c'est mieux de ne pas utiliser
        l'instanciation statique
         */
        DaoImpl dao = new DaoImpl();
        //DaoImpl2 dao = new DaoImpl2();
        //IMetierImpl metier = new IMetierImpl(dao);
        //metier.setDao(dao);
        //System.out.println("resultat = "+metier.calcul());
    }
}
