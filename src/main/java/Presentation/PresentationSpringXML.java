package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        //demarrer spring , spring va lire le fichier xml et il va creer les objets et les stockent dans une collection de type map
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //récuperer un objet de type IMetier
        IMetier metier =(IMetier)context.getBean("metier");

        //afficher le résultat
        System.out.println(metier.calcul());
    }
}
