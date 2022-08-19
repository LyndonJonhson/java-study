package functionalProgrammingAndLambdaExpressions.consumer.util;

import functionalProgrammingAndLambdaExpressions.consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}