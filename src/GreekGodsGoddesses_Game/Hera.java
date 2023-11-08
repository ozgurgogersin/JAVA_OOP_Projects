package GreekGodsGoddesses_Game;

public class Hera extends Goddeses {
    private int obstinacy;

    public Hera() {
        this.obstinacy = 0;
    }


    public int getObstinacy() {
        return obstinacy;
    }

    public void setObstinacy(int obstinacy) {
        this.obstinacy = obstinacy;
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
        System.out.println("Obstinacy = " + getObstinacy());

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
                + " beauty.");
        System.out.println("Furthermore, " + getName() + " can attack with " + getObstinacy() + "-strenght obstinacy and will never give up the fight until she wins. beauty. ");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(getName() + "'s secret power is " + getObstinacy() + "-strenght obstinacy. She never gives up till the end. ");


    }
}
