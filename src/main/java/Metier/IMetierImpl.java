package Metier;

import dao.DaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // instancie moi cette classe une fois que tu le trouves
public class IMetierImpl implements IMetier {
  //  @Autowired //attribuer a cette variable l'objet de type daoImpl que tu as deja créé (ce n'est pas recommandé )
    //c'est mieux de faire l'injcetion via le constructeur avec paramètre
    /*
      public IMetierImpl(DaoInterface dao){
        this.dao=dao;
    }
     */


     @Autowired
     @Qualifier("dao1") // Puisqu'il y avait deux objets de type DaoInterface qui sont crées donc il faut choisir un objet qu'on va l'utiliser sinon c'est exception de type ConflictingBeanDefinitionException

     //pour le constructeur ce probleme ne se pose pas car le permier objet créé qui va être utilisé par le constructeur
   /* public IMetierImpl(DaoInterface dao){
        this.dao=dao;
    }
    */
    private DaoInterface dao; //couplage faible dao=null faire attention à l'Exception NullpointerException
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    //injection via les setters
    //injecter dans la variable dao un objet d'une classe qui implémente l'interface DaoInterface
    public void setDao(DaoInterface dao) {
        this.dao = dao;
    }
}
