package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Wolf  extends Animal{

    private String name;
    private String nameHouse;
    private String sex;
    private int feedDate;
    private String landOfOrigin;

    public Wolf(String name, String nameHouse, String sex, int feedDate, String landOfOrigin){
        this.name = name;
        this.nameHouse = nameHouse;
        this.sex = sex;
        this.feedDate = feedDate;
        this.landOfOrigin = landOfOrigin;
    }

    public String feedDate(){
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String feedingDay = days[feedDate - 1];

        return name + " has been fed on: " + feedingDay;
    }

    @Override
    public String pack(){
        return name + " is part of the 'Moon stone pack'";
    }

    public String food(){
        return "meat";
    }

    public double animalMovement(){
        return 0.50;
    }

    public String makeSound(){
        return name + " says Ooooooooooooh!";
    }
}
