package AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import SimpleFacotry.Pizza;

public class OrderPizza {
    AbsFactory factory;

    // constructor
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            // factory could be BJFactory or OtherFactory
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while(true);
    }

    private String getType(){
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            String str = string.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
