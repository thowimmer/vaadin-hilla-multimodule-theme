package com.mc533.stocksimulator.feature2;

import com.mc533.stocksimulator.shared.CounterRepository;
import org.springframework.stereotype.Component;

@Component
class Feature2UseCase implements Feature2InputPort {

    private static final int MAX_COUNTER_THRESHOLD = 10;

    private final CounterRepository counterRepository;

    Feature2UseCase(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @Override
    public void incrementCounter() {
        int currentCounter = counterRepository.getCounter();

        if(currentCounter >= MAX_COUNTER_THRESHOLD) {
            counterRepository.setCounter(0);
        } else {
            counterRepository.setCounter(currentCounter + 1);
        }
    }
}
