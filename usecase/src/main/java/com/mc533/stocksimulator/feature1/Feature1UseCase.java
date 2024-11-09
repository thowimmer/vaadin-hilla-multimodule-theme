package com.mc533.stocksimulator.feature1;

import com.mc533.stocksimulator.shared.CounterRepository;
import org.springframework.stereotype.Component;

@Component
class Feature1UseCase implements Feature1InputPort {

    private final CounterRepository counterRepository;

    Feature1UseCase(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @Override
    public int queryCounter() {
        return counterRepository.getCounter();
    }
}
