public class Frog extends Animal implements Land, Water {
    private int numberOfLegs = 4;

    public Frog(boolean mammlals, boolean carnivous, int mood) {
        super(mammlals, carnivous, mood);
    }


    @Override
    public void sayHello(int mood) {
        if (mood == MOOD_HAPPY)
            System.out.println("quack quack quack");
        else if (mood == MOOD_SCARE) System.out.println("plop into the water");
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }
}
