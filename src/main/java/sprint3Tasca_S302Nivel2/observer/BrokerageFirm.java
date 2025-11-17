package sprint3Tasca_S302Nivel2.observer;

import sprint3Tasca_S302Nivel2.StockState;

/**
 * ClassName: BrokerageFirm
 * Package: sprint3Tasca_S302Nivel2.observer
 * Description:
 * Author: Rong Jiang
 * Create:17/11/2025 - 21:06
 * Version:v1.0
 */
public class BrokerageFirm implements Observer{
    private int stockIndex;

    @Override
    public void update(StockState stockState ,int stockIndex) {
        this.stockIndex = stockIndex;
        display();

    }

    public void display() {
        System.out.println("The stock index now is " + stockIndex);
    }
}
