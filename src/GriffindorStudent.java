public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int getInnerTotalPower() {
        return nobility + honor + bravery;
    }

    public void innerCompareTo (GriffindorStudent other) {
        if (other.getInnerTotalPower() < this.getInnerTotalPower()) {
            System.out.println(this.getName() + " Сильнее чем " + other.getName());
        } else if (other.getInnerTotalPower() > this.getInnerTotalPower()) {
            System.out.println(other.getName() + " Сильнее чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе" );
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
