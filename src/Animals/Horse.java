package Animals;

public class Horse extends Animal {
    String nickname;

    public Horse() {

    }

    public Horse(String food, String location, String nickname) {
        super(food, location);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь кричит");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public String toString() {
        return "Лошадь ";
    }
}
