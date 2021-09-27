public class Cat implements Domesticatable, Tradable{
    @Override
    public int getPrice() {
        return 9999;
    }

    @Override
    public String sound() {
        return "Meow!";
    }

}
