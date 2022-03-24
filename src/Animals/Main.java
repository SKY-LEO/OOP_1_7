package Animals;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String color, food, location, nickname;
        double weight;
        ArrayList<Animal> Animals = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int variant;
        boolean flag = true;
        while(flag) {
            System.out.println("Выберите, кого вы хотите добавить: \n1. Собака\n2. Кот\n3. Лошадь\n0. Назад\n");
            variant = Integer.parseInt(reader.readLine());
            switch (variant) {
                case 1 -> {
                    Dog dog = new Dog();
                    System.out.println("Введите название корма: ");
                    food = reader.readLine();
                    dog.setFood(food);
                    System.out.println("Введите местоположение: ");
                    location = reader.readLine();
                    dog.setLocation(location);
                    System.out.println("Введите вес: ");
                    weight = Double.parseDouble(reader.readLine());
                    dog.setWeight(weight);
                    Animals.add(dog);
                }
                case 2 -> {
                    Cat cat = new Cat();
                    System.out.println("Введите название корма: ");
                    food = reader.readLine();
                    cat.setFood(food);
                    System.out.println("Введите местоположение: ");
                    location = reader.readLine();
                    cat.setLocation(location);
                    System.out.println("Введите цвет: ");
                    color = reader.readLine();
                    cat.setColor(color);
                    Animals.add(cat);
                }
                case 3 -> {
                    Horse horse = new Horse();
                    System.out.println("Введите название корма: ");
                    food = reader.readLine();
                    horse.setFood(food);
                    System.out.println("Введите местоположение: ");
                    location = reader.readLine();
                    horse.setLocation(location);
                    System.out.println("Введите кличку: ");
                    nickname = reader.readLine();
                    horse.setNickname(nickname);
                    Animals.add(horse);
                }
                default -> flag = false;
            }
        }
        reader.close();
        Vet vet = new Vet();
        for (Animal animal : Animals) {
            vet.treatAnimal(animal);
        }
    }
}
