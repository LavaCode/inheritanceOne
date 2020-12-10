package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Cat extends Animal{

    private String name;
    private String nameHouse;
    private String foodBrand;
    private String sex;
    private String type;
    private String innerCat;

    public Cat(String name, String nameHouse, String foodBrand, String sex, String type, String innerCat){
        this.name = name;
        this.nameHouse = nameHouse;
        this.foodBrand = foodBrand;
        this.sex = sex;
        this.type = type;
        this.innerCat = innerCat;
    }

    public void firstName(){
        System.out.println(name);
    }

    @Override
    public String innerAnimal(){
        if(innerCat.equals("inside")){
            return name + " is a cat, that prefers to be inside.";
        }
        return name + " is a cat, that prefers to be outside.";
    }

    public String makeSound(){
        return name + " says Meooow!";
    }

    public String food(){
        return name + " prefers " + foodBrand;
    }

    public double animalMovement(){
        return 0.25;
    }


}
