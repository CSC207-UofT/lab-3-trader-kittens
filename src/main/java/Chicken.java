public class Chicken implements Tradable, Domesticatable {
    private int weight;

    public Chicken() {
        this.weight = 5;
    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String sound() {
        return "Woo-Woo!";
    }

}
