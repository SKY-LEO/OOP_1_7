package Animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Purina", "Molodechno", 5.6);
        Animal cat = new Cat("Felix", "Minsk", "Gray");
        Animal horse = new Horse("Corn", "Vyazynka", "Lucky");
        Animal[] animals = {dog, cat, horse};
        Vet vet = new Vet();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
