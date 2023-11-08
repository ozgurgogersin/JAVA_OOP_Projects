package GreekGodsGoddesses_Game;

public class Apollo extends Gods {
    private int sunPower;

    public Apollo() {
        this.sunPower = 0;
    }

    public int getSunPower() {
        return sunPower;
    }

    public void setSunPower(int sunPower) {
        this.sunPower = sunPower;
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
        System.out.println("Aggression = " + getAggression());

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
        System.out.println("Furthermore, " + getName() + " can attack with " + getSunPower() + " sun power and wipes out his enemies.");
    }

    @Override
    public void exposeSecretPower() {

        System.out.println(getName() + " has the power of controlling the sun and he can do anything with by controlling it.");

    }
}
