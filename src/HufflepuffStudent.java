public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    private int getInnerTotalPower() {
        return hardworking + loyalty + honesty;
    }

    public void innerCompareTo (HufflepuffStudent other) {
        if (other.getInnerTotalPower() < this.getInnerTotalPower()) {
            System.out.println(this.getName() + " Сильнее чем " + other.getName());
        } else if (other.getInnerTotalPower() > this.getInnerTotalPower()) {
            System.out.println(other.getName() + " Сильнее чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе" );
        }
    }
}
