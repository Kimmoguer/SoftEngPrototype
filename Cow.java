public class Cow extends Animal {

    public Cow(int legs, String sound, String food, String name) {
        super(legs, sound, food, name);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public Cow clone() {
        return (Cow) super.clone();
    }
}