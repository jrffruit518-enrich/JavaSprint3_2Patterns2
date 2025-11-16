package sprint3Tasca_S302Nivel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: Pizza
 * Package: sprint3Tasca_S302Nivel1
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:39
 * Version:v1.0
 */
public class Pizza {
    private final int size;
    private final String dough;
    private final List <String> toppings;

    public Pizza(int size, String dough,List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = List.copyOf(toppings);
    }

    public int getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && Objects.equals(dough, pizza.dough) && Objects.equals(toppings, pizza.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, dough, toppings);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", topping=" + toppings +
                '}';
    }
}
