package com.mc533.stocksimulator.feature1;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

@BrowserCallable
@AnonymousAllowed
public class Feature1Endpoint {

    private final Feature1InputPort inputPort;

    Feature1Endpoint(Feature1InputPort inputPort) {
        this.inputPort = inputPort;
    }

    public int queryCounter() {
        return inputPort.queryCounter();
    }
}
