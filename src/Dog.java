public class Dog extends Animal implements Land {
    private int numberOfLegs = 4;

    public Dog(boolean mammlals, boolean carnivous, int mood) {
        super(mammlals, carnivous, mood);
    }

    @Override
    public void sayHello() {
    super.sayHello();
    }

    @Override
    public void sayHello(int mood) {
        if (mood == MOOD_HAPPY)
            System.out.println("bark loudly");
        else if (mood == MOOD_SCARE)
            System.out.println("whooping");
        else System.out.println("wagging their tails");
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
