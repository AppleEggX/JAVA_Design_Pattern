package AbstractFactory;

import FactoryMode.BJChessePizza;
import FactoryMode.BJPepperPizza;
import SimpleFacotry.Pizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")){
            pizza = new BJChessePizza();
        } else if (orderType.equals("pepper")){
            pizza =new BJPepperPizza();
        }
        return pizza;
    }
    
}
