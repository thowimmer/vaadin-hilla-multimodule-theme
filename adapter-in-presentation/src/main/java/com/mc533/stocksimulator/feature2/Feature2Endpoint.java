package com.mc533.stocksimulator.feature2;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

@BrowserCallable
@AnonymousAllowed
public class Feature2Endpoint {

    private final Feature2InputPort inputPort;

    Feature2Endpoint(Feature2InputPort inputPort) {
        this.inputPort = inputPort;
    }

    public void incrementCounter() {
        inputPort.incrementCounter();
    }
}
