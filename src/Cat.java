public class Cat extends Animal implements Land {
    private int numberOfLegs = 4;

    public Cat(boolean mammlals, boolean carnivous, int mood) {
        super(mammlals, carnivous, mood);
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayHello(int mood) {
        if (mood == MOOD_HAPPY)
            System.out.println("purr, purr");
        else if (mood == MOOD_SCARE)
            System.out.println("hiss");
        else System.out.println("meow");
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
