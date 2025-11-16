package sprint3Tasca_S302Nivel1.Builder;

import sprint3Tasca_S302Nivel1.Pizza;

/**
 * ClassName: HawaiianPizzaBuilder
 * Package: sprint3Tasca_S302Nivel1.Builder
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:55
 * Version:v1.0
 */
public class HawaiianPizzaBuilder implements PizzaBuilder {

    Pizza pizza;
    @Override
    public PizzaBuilder buildSize(int size) {
        pizza.setSize(size);
        return new HawaiianPizzaBuilder();
    }

    @Override
    public PizzaBuilder buildDough(String dough){
        pizza.setDough(dough);
        return new HawaiianPizzaBuilder();
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return new HawaiianPizzaBuilder();
    }

    @Override
    public Pizza getResult() {
        return pizza;
    }
}
