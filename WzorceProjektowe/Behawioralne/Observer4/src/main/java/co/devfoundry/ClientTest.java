package co.devfoundry;

import co.devfoundry.notification.Email;
import co.devfoundry.notification.MobileApp;
import co.devfoundry.notification.TextMessage;
import co.devfoundry.order.Order;
import co.devfoundry.order.OrderStatus;

public class ClientTest {

    @org.junit.Test
    public void test() {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);  // klasa agregująca

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        // agregujemy obserwatorów
        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("------------------------------");

        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);

        System.out.println("------------------------------");

        order.changeOrderStatus(OrderStatus.ODEBRANE);

    }

}
