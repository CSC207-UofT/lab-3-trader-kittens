public class Cow implements Tradable,Drivable{
    private int age;
    private int maxSpeed;

    public Cow(int age) {
        this.maxSpeed = 1;
        this.age = age;
    }
    @Override
    public int getPrice() {
        return age * 40;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 1;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 1;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "age=" + age +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
