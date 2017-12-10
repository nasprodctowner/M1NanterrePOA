package pattern.singleton.clientAndProducts.api;

public final class ProductC implements Product {

    ProductC(){}

    @Override
    public void doStuff() {
        System.out.println("I'm a ProductC, performing");
    }
}
