package sprint3Tasca_S302Nivel1.Builder;

import sprint3Tasca_S302Nivel1.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: HawaiianPizzaBuilder
 * Package: sprint3Tasca_S302Nivel1.Builder
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:55
 * Version:v1.0
 */
public class HawaiianPizzaBuilder implements PizzaBuilder {
    private int size;
    private String dough;
    private List<String> toppings = new ArrayList<>();
    Pizza pizza;
    @Override
    public PizzaBuilder buildSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder buildDough(String dough){
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size,dough,toppings);
    }
}
