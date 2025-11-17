package sprint3Tasca_S302Nivel2.observer;

import sprint3Tasca_S302Nivel2.StockState;

/**
 * ClassName: StockAgency
 * Package: sprint3Tasca_S302Nivel2.observer
 * Description:
 * Author: Rong Jiang
 * Create:17/11/2025 - 21:06
 * Version:v1.0
 */
public class StockAgency implements Observer{
    private StockState stockState;
    private int stockIndex;

    @Override
    public void update(StockState stockState ,int stockIndex) {
        this.stockState = stockState;
        this.stockIndex = stockIndex;
        display();

    }

    public void display() {
        System.out.println("The stock state is " + stockState);
        System.out.println("The stock index now is " + stockIndex);
    }
}
