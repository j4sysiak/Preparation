package com.company;

public abstract class PizzaDecorator implements IPizza {

    //informacja o pizzy, którą dekorujemy
    private IPizza iPizza;

    //ponieważ jest to klasa abstrakcyjne, więc nie można utworzyć obiektu tej klasy - dlatego dostęp do konstruktora robimy protected
    // nie może być public
    protected PizzaDecorator(IPizza iPizza) {
        this.iPizza = iPizza;
    }

    // każda implementacja dekoratora (HamPizzaDecorator, CheesePizzaDecorator, SelamiPizzaDecorator)
    //  musi wprowadzić własną mplementację tej właśnie metody tzn. muszą te klasy nadpisać @Override tą metodę
    public double calculatePrice() {
        return iPizza.calculatePrice();
    }
}
