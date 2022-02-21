package Animals;

public class Dog extends Animal {
    public double weight;

    public Dog() {

    }

    public Dog(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака кричит");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
}
