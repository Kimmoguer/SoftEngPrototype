public class Horse extends Animal {

    public Horse(int legs, String sound, String food, String name) {
        super(legs, sound, food, name);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public Horse clone() {
        return (Horse) super.clone();
    }
}