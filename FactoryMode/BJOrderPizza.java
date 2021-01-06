package FactoryMode;

import SimpleFacotry.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new BJGreekPizza();
            pizza.setName(" Greek Pizza");
        } else if (orderType.equals("cheese")){
            pizza = new BJChessePizza();
            pizza.setName("Cheese Pizza");
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("Pepper Pizza");
        }
        return pizza;
    }

    
}
