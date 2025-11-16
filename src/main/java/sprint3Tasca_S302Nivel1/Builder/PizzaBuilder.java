package sprint3Tasca_S302Nivel1.Builder;

import sprint3Tasca_S302Nivel1.Pizza;

/**
 * ClassName: PizzaBuilder
 * Package: sprint3Tasca_S302Nivel1
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:51
 * Version:v1.0
 */
public interface PizzaBuilder {
    public PizzaBuilder buildSize(int size);
    public PizzaBuilder buildDough(String dough);
    public PizzaBuilder addTopping(String tipping);
    public Pizza getResult();
}
