package com.mc533.stocksimulator.shared;

import org.springframework.stereotype.Component;

@Component
class InMemoryCounterRepository implements CounterRepository {

    private int counter = 0;

    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public void setCounter(int counter) {
        this.counter = counter;
    }
}
