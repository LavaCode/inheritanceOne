package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Dog  extends Animal{
    private String name;
    private String nameHouse;
    private String sex;
    private String foodbrand;
    private String type;

    public Dog(String name, String nameHouse, String sex, String foodbrand, String type){
        this.name = name;
        this.nameHouse = nameHouse;
        this.sex = sex;
        this.foodbrand = foodbrand;
        this.type = type;
    }

    @Override
    public String food(){
        return name + " likes " + foodbrand;
    }

    public String makeSound(){
        return name + " says Woof!";
    }

    public double animalMovement(){
        return 0.25;
    }
}
