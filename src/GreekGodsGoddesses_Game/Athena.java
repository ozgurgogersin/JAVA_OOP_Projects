package GreekGodsGoddesses_Game;

public class Athena extends Goddeses {
    private int strategy;

    public Athena() {
        this.strategy = 0;
    }


    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
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
        System.out.println("Strategy = " + getStrategy());

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
        System.out.println("Furthermore, " + getName() + " can create very smart strategies with her " + getAggression() + "-strenght tactics.");
    }

    @Override
    public void exposeSecretPower() {

        System.out.println("As the goddess of wisdom and reason, " + getName() + " can create very smart strategies to defeat her enemies.");

    }
}
