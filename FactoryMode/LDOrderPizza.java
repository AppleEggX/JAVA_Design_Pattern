package FactoryMode;

import SimpleFacotry.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new LDGreekPizza();
            pizza.setName(" Greek Pizza");
        } else if (orderType.equals("cheese")){
            pizza = new LDChessePizza();
            pizza.setName("Cheese Pizza");
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
            pizza.setName("Pepper Pizza");
        }
        return pizza;
    }
    
}
