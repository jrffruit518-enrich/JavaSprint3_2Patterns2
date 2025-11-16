package sprint3Tasca_S302Nivel1;

import sprint3Tasca_S302Nivel1.Builder.PizzaBuilder;

/**
 * ClassName: MestrePizzer
 * Package: sprint3Tasca_S302Nivel1
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:49
 * Version:v1.0
 */
public class MestrePizzer {
    private PizzaBuilder pizzaBuilder;
    public Pizza buildPizza(int size,Dough dough) {
        return this.pizzaBuilder.buildSize(size).buildDough(dough).getResult();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
}
