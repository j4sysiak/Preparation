package com.company;

public interface IMediator {

    void notify(Component sender, String event);  // event - np. guzik wciśnięty, checkox odhaczony etc. - taki event o którym chcielibyśmy powiadomić inne komponenty
}
