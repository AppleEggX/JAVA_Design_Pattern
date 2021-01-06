package PrototypeMode;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "MengGu";
    public Sheep friend; // 对于对象， 克隆默认是 浅拷贝 
    
    public Sheep (String name, int age, String color){
        super(); // 调用父类构造器
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep [name="+name+",age="+age+",color="+color+"]";
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
