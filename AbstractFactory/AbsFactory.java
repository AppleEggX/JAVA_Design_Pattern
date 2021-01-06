package AbstractFactory;

import SimpleFacotry.Pizza;

public interface AbsFactory {
    public  Pizza createPizza(String orderType);
}
