package com.thowimmer.example;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

@BrowserCallable
@AnonymousAllowed
public class ExampleEndpoint {

    private int counter = 0;

    public int getCounter() {
        int oldCounter = counter;
        counter = oldCounter + 1;
        return oldCounter;
    }
}
