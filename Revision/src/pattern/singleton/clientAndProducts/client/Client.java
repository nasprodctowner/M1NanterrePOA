package pattern.singleton.clientAndProducts.client;

import pattern.singleton.clientAndProducts.api.Product;
import pattern.singleton.clientAndProducts.api.ProductFactory;

public class Client {
    public static void main(String[] args) {

        ProductFactory factory = ProductFactory.getInstance();

        Product productA = factory.createProductA();
        Product productB = factory.createProductB();
        Product productC = factory.createProductC();

        productA.doStuff();
        productB.doStuff();
        productC.doStuff();

    }
}
