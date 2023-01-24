package extension;

import dao.DaoInterface;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements DaoInterface {
    @Override
    public double getData() {
        double tmp =(int) (Math.random()*1000);
        System.out.println("Version Capteur");
        return tmp;
    }
}
