package dao;

import org.springframework.stereotype.Component;

@Component("dao1") //une fois spring trouve cette classe , il effectue  une instanciation de cette classe et lui donne le nom dao1
public class DaoImpl implements DaoInterface{
    @Override
    public double getData() {
        /*
        se connecter à la base de donnéés
         */
        System.out.println("version base de données");
        double tmp = Math.random()*40;
        return tmp;
    }
}
