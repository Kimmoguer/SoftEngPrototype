public class AnimalRegistry {
    private Cow cowPrototype;
    private Sheep sheepPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        cowPrototype = new Cow(4, "Moo", "Grass", "Default Cow");
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Default Sheep");
        horsePrototype = new Horse(4, "Neigh", "Hay", "Default Horse");
    }

    public Cow createCow(String name) {
        Cow cow = cowPrototype.clone();
        cow.setName(name);
        return cow;
    }

    public Sheep createSheep(String name) {
        Sheep sheep = sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }

    public Horse createHorse(String name) {
        Horse horse = horsePrototype.clone();
        horse.setName(name);
        return horse;
    }
}