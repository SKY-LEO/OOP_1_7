package Animals;

public class Cat extends Animal {
    public String color;

    public Cat() {

    }

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот кричит");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }
}
