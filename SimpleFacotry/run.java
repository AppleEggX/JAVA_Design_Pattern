package SimpleFacotry;

public class run {
    public static void main (String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(simpleFactory);

    }
}
