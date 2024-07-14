import drinks.HotBeverage;
import drinks.HotBeverageVendingMachine;
import drinks.HotDrink;

public class Main {
    public static void main(String[] args) {

        //  Creating multiple instances of HotDrinks
        HotDrink tea = new HotDrink("Tea", 200, 70);
        HotDrink coffee = new HotDrink("Coffee", 250, 80);

        // Creating an instance of HotDrinksAutomate
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();

        // Obtaining a product with specified parameters from the dispenser
        HotBeverage hotBeverage = vendingMachine.getProduct("Tea", 200, 70);

        // Output of information about the received product
        System.out.println("Received: " + hotBeverage.name + " - Volume: " + hotBeverage.volume + "ml - Temperature: " + ((HotDrink) hotBeverage).temperature + "°C");
    }

}
