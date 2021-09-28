public class Homework implements Tradable, Domesticatable{
    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String sound() {
        return "Moooow";
    }
}
