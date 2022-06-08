package com.company;

public abstract class Component {

    // zadaniem tej klasy jest ustawienie referencji do mediatora

    protected IMediator iMediator;

    public void setMediator(IMediator iMediator) {
        this.iMediator = iMediator;
    }
}
