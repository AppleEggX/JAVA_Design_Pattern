package SimpleFacotry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    // Define a simple factory object
    SimpleFactory simpleFactory = new SimpleFactory();
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFacotry){
        String orderType = ""; // user input
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            // output pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" order failed");
                break;
            }
        } while(true);
    }
    private String getType(){
        try{
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza TYPE: ");
            String str = string.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
