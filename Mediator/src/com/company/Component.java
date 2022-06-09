package com.company;

public abstract class Component {

    // zadaniem tej klasy jest ustawienie referencji do mediatora

    protected IMediator iMediator;

    // Dependeny Injection
    public void setIMediator(IMediator iMediator) {
        this.iMediator = iMediator;
    }
}
