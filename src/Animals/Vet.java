package Animals;

public class Vet {
    public Vet() {

    }

    public void treatAnimal(Animal animals) {
        System.out.println("Корм: " + animals.food + " Местоположение: " + animals.location);
    }
}
