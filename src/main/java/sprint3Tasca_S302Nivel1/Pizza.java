package sprint3Tasca_S302Nivel1;

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
    private int size;
    private String dough;
    List <String> topping;

    public Pizza(int size, String dough, List<String> topping) {
        this.size = size;
        this.dough = dough;
        this.topping = topping;
    }

    public int getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getTopping() {
        return topping;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && Objects.equals(dough, pizza.dough) && Objects.equals(topping, pizza.topping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, dough, topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", topping=" + topping +
                '}';
    }
}
