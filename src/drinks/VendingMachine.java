package drinks;

public interface VendingMachine {
    HotBeverage getProduct(String name, int volume, int temperature);
}
