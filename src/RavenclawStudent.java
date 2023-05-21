public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;


    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                '}';
    }

    private int getInnerTotalPower() {
        return smart + wise + witty;
    }

    public void innerCompareTo (RavenclawStudent other) {
        if (other.getInnerTotalPower() < this.getInnerTotalPower()) {
            System.out.println(this.getName() + " Сильнее чем " + other.getName());
        } else if (other.getInnerTotalPower() > this.getInnerTotalPower()) {
            System.out.println(other.getName() + " Сильнее чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе" );
        }
    }
}
