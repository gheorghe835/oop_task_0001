package drinks;

public class HotBeverageVendingMachine implements VendingMachine  {
    @Override
    public HotBeverage getProduct(String name, int volume, int temperature) {
        // Здесь можно добавить логику по выдаче продукта по заданным параметрам
        return new HotDrink(name, volume, temperature);
    }
}
