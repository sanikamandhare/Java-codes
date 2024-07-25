class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;

    private static CoffeeMachine instance = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
    }

    public static CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

}

public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
       
    }
}
