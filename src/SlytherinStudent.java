public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    private int getInnerTotalPower() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void innerCompareTo (SlytherinStudent other) {
        if (other.getInnerTotalPower() < this.getInnerTotalPower()) {
            System.out.println(this.getName() + " Сильнее чем " + other.getName());
        } else if (other.getInnerTotalPower() > this.getInnerTotalPower()) {
            System.out.println(other.getName() + " Сильнее чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе" );
        }
    }
}
