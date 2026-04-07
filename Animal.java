public abstract class Animal implements Cloneable {
    protected int legs;
    protected String sound;
    protected String food;
    protected String name;

    public Animal(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public abstract String getType();

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported");
        }
    }

    @Override
    public String toString() {
        return "Type: " + getType() +
               ", Name: " + name +
               ", Legs: " + legs +
               ", Sound: " + sound +
               ", Food: " + food;
    }
}