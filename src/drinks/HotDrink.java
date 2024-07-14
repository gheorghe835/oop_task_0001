package drinks;

public class HotDrink extends HotBeverage{
    public int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
}
