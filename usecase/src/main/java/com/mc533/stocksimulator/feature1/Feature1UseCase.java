package com.mc533.stocksimulator.feature1;

import org.springframework.stereotype.Component;

@Component
class Feature1UseCase implements Feature1InputPort {

    private int count = 0;

    @Override
    public int queryCounter() {
        int oldCounter = count;
        count = oldCounter + 1;
        return oldCounter;
    }
}
