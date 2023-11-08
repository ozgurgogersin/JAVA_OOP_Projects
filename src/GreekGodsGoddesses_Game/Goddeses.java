package GreekGodsGoddesses_Game;

public class Goddeses implements Game {
    private String name;
    private String gender;
    private int aggression;
    private int wisdom;
    private int beauty;

    public Goddeses() {
        this.name = "name";
        this.gender = "gender";
        this.aggression = 0;
        this.wisdom = 0;
        this.beauty = 0;
    }

    public Goddeses(String name, String gender, int aggression, int wisdom, int beauty) {
        this.name = name;
        this.gender = gender;
        this.aggression = aggression;
        this.wisdom = wisdom;
        this.beauty = beauty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
    }

    @Override
    public void printInfo() {
        System.out.println("*******************");
        System.out.println("Information");
        System.out.println("-------------------");
        System.out.println("Name : " + getName() +
                "\n Gender : " + getGender() +
                "\n Aggression : " + getAggression() +
                "\n Wisdom : " + getWisdom() +
                "\n Beauty : " + getBeauty());
    }

    @Override
    public void attack() {
        System.out.println("*******************");

        System.out.println("-------------------");
        System.out.println(getName()
                +" attacks with"
                + getAggression()+
                " aggression,"
                + getWisdom()+
                " wisdom,"
                +getBeauty()
                +" beauty.");
    }

    @Override
    public void exposeSecretPower() {

    }
}
