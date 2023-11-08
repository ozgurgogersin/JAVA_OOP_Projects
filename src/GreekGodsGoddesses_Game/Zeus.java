package GreekGodsGoddesses_Game;

public class Zeus extends Gods {
    private int controlOverWeather;

    public Zeus() {
        this.controlOverWeather = 0;
    }

    public int getControlOverWeather() {
        return controlOverWeather;
    }

    public void setControlOverWeather(int controlOverWeather) {
        this.controlOverWeather = controlOverWeather;
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
        System.out.println("Special Power ");
        System.out.println("--------------------");
        System.out.println("Control over weather = " + getControlOverWeather());

    }

    @Override
    public void attack() {
        System.out.println("*******************");

        System.out.println("-------------------");
        System.out.println(getName()
                + " attacks with "
                + getAggression() +
                " aggression, "
                + getWisdom() +
                " wisdom, "
                + getBeauty()
                + " beauty. ");
        System.out.println("Furthermore, " + getName() + " can attack with " + getControlOverWeather() + " -strenght thunderbolts and storms. ");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(getName() + " is attacking to his enemies with " + getControlOverWeather() + " -strenght thunderbolts and storms.");

    }
}
