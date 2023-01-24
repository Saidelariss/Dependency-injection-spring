package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("dao","Metier","extension");//c'est mieux que tous les packages se trouvent dans le meme package (par exemple ma.ehtp)  pour indiquer juste un seul package (scanner le package et tous ses descendants)
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
