package FactoryMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import SimpleFacotry.Pizza;


public abstract class OrderPizza {

    // define a abstract method 'createPizza' so that each factory can implement 
    abstract Pizza createPizza(String orderType);

    // constractor
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType); // abstract method, will be done by factory sub-class
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while(true);
    }

    private String getType() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type:");
            String str = string.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}