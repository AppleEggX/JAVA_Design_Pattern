package SimpleFacotry;

public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        System.out.println("use Simple Factory Modle");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(" Greek Pizza");
        } else if (orderType.equals("cheese")){
            pizza = new ChessePizza();
            pizza.setName("Cheese Pizza");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("Pepper Pizza");
        }

        return pizza;
    }
    public Pizza createPizza2(String orderType){
        Pizza pizza = null;

        System.out.println("use Simple Factory Modle");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(" Greek Pizza");
        } else if (orderType.equals("cheese")){
            pizza = new ChessePizza();
            pizza.setName("Cheese Pizza");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("Pepper Pizza");
        }

        return pizza;
    }
}