package pattern.singleton.clientAndProducts.api;

public class ProductFactory {

    private ProductFactory() {
    }

    //holder
    private static final class SingletonHolder{
        private static final ProductFactory INSTANCE = new ProductFactory();
    }

    public static ProductFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }


    public Product createProductA(){
        return new ProductA();
    }

    public Product createProductB(){
        return new ProductB();
    }

    public Product createProductC(){
        return new ProductC();
    }
}
