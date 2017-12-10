package pattern.singleton.clientAndProducts.api;

public final class ProductB implements Product {

    ProductB(){}

    @Override
    public void doStuff() {
        System.out.println("I'm a ProductB, doing it");
    }
}
