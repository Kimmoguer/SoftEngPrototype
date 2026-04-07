public class Sheep extends Animal {

    public Sheep(int legs, String sound, String food, String name) {
        super(legs, sound, food, name);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public Sheep clone() {
        return (Sheep) super.clone();
    }
}