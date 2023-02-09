public class TestAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog(true, true, Animal.MOOD_HAPPY);
        Cat cat = new Cat(true, true, Animal.MOOD_SCARE);
        Frog frog = new Frog(false, false, Animal.MOOD_SCARE);

        System.out.println("Dog");
        dog.sayHello();
        dog.sayHello(Animal.MOOD_SCARE);
        System.out.println("The number of legs of a dog" + " " + dog.getNumberOfLegs());
        System.out.println();

        System.out.println("Cat");
        cat.sayHello();
        cat.sayHello(Animal.MOOD_HAPPY);
        System.out.println("The number of legs of a cat" + " " + cat.getNumberOfLegs());
        System.out.println();

        System.out.println("Frog");
        frog.sayHello();
        frog.sayHello(Animal.MOOD_HAPPY);
        System.out.println("The number of legs of a frog" + " " + frog.getNumberOfLegs());
        System.out.println("hasGill" + " " + frog.hasGills());
        System.out.println("hasLaysEggs" + " " + frog.hasLaysEggs());
    }
}