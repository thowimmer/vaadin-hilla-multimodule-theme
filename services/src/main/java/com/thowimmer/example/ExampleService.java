package com.thowimmer.example;

import org.springframework.stereotype.Component;

@Component
class ExampleService {

    private int counter = 0;

    int getCounter() {
        int oldCounter = counter;
        counter = oldCounter + 1;
        return counter;
    }
}
