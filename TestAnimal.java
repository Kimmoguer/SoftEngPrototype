public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Cow cow1 = registry.createCow("Cow 1");
        Cow cow2 = registry.createCow("Cow 2");

        Sheep sheep1 = registry.createSheep("Sheep 1");
        Sheep sheep2 = registry.createSheep("Sheep 2");

        Horse horse1 = registry.createHorse("Horse 1");
        Horse horse2 = registry.createHorse("Horse 2");

        System.out.println("=== PROTOTYPE DESIGN PATTERN ===");

        System.out.println(cow1);
        cow1.makeSound();
        System.out.println();

        System.out.println(cow2);
        cow2.makeSound();
        System.out.println();

        System.out.println(sheep1);
        sheep1.makeSound();
        System.out.println();

        System.out.println(sheep2);
        sheep2.makeSound();
        System.out.println();

        System.out.println(horse1);
        horse1.makeSound();
        System.out.println();

        System.out.println(horse2);
        horse2.makeSound();
    }
}