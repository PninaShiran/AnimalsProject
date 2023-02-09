public abstract class Animal {
    private boolean mammlals;
    private boolean carnivous;
    public static final int MOOD_HAPPY = 1;
    public static final int MOOD_SCARE = 2;
    private int mood;


    public Animal(boolean mammlals, boolean carnivous, int mood) {
        this.mammlals = mammlals;
        this.carnivous = carnivous;
        this.mood = mood;
    }

    public  void sayHello() {
        sayHello(mood);
    }

    public abstract void sayHello(int mood);

    public boolean isMammlals() {
        return this.mammlals;
    }

    public void setMammlals(boolean mammlals) {
        this.mammlals = mammlals;
    }

    public boolean isCarnivous() {
        return this.carnivous;
    }

    public void setCarnivous(boolean carnivous) {
        this.carnivous = carnivous;
    }
}

