package PrototypeMode;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "White");

        sheep.friend = new Sheep("jack",2,"Black");

        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();

        System.out.println("sheep:" + sheep.hashCode());
        System.out.println("sheep2:" + sheep2.hashCode());
        System.out.println("Sheep2= "+ sheep2+"sheep2.friend "+sheep2.friend.hashCode());
        System.out.println("Sheep3= "+ sheep3+"sheep3.friend "+sheep3.friend.hashCode());
    }
}
