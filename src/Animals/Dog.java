package Animals;

public class Dog extends Animal {
    double weight;

    public Dog() {

    }

    public Dog(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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

    @Override
    public String toString() {
        return "Собака ";
    }
}
