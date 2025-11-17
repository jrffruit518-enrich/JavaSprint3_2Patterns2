package sprint3Tasca_S302Nivel2.observer;

import sprint3Tasca_S302Nivel2.StockState;
import sprint3Tasca_S302Nivel2.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Broker
 * Package: sprint3Tasca_S302Nivel2.observer
 * Description:
 * Author: Rong Jiang
 * Create:17/11/2025 - 21:32
 * Version:v1.0
 */
public class Broker implements Subject {
    private StockState stockState;
    private int stockIndex;
    private List <Observer> observers = new ArrayList<>();

    public StockState getStockState() {
        return stockState;
    }

    public int getStockIndex() {
        return stockIndex;
    }

    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void inform() {


    }
}
