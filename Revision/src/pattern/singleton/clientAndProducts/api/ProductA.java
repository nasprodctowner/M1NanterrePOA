package pattern.singleton.clientAndProducts.api;

public final class ProductA implements Product {

    ProductA() {}

    @Override
    public void doStuff() {
        System.out.println("I'm a ProductA, doing my stuff");
    }
}
