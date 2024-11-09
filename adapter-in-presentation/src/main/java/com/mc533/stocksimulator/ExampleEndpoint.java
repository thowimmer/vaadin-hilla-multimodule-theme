package com.mc533.stocksimulator;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

@BrowserCallable
@AnonymousAllowed
public class ExampleEndpoint {

    private final ExampleService service;

    public ExampleEndpoint(ExampleService service) {
        this.service = service;
    }

    public int getCounter() {
        return service.getCounter();
    }
}
