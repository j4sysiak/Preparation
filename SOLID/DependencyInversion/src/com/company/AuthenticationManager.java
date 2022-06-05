package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
@Builder
/*Moduł wysokopoziomowy*/
// będzie musiała zależeć od jakiejś akstrakcji a nie bezpośrednio od klasy EmailNotification
// więc wstawiamy nowe pole iNotificationSender Interfejsu INotificationSender

/*
Dependency Injection
Skorzystamy tutaj z DependencyInjection:  czyli wstrzyknięcie zależności (przez konstruktor, metodę lub set()).
DependencyInjection: to mechanizm, który pozwoli nam dostarczyć konkretną klasę z modułu niskopoziomowego (EmailNotification, SMSNotification) dzięki Interfejsowi INotificationSender do klasy wysokopoziomowego modułu (tej klasy) AuthenticationManager.
Przez konstruktor klasy AuthenticationManager (wysokopoziomowej) dostarczymy obiekt INotificationSender i następnie przypiszemy go do pola prywatnego iNotificationSender.
Przez to klasa wysokopoziomowego modułu nie jest już bezpośrednio zależna od modułów niskopoziomowych: (EmailNotification, SMSNotification).
Dzięki temu możemy w dowolny sposób dostarczać implementację jakiejś dowolnej klasy z niskopoziomowego modułu a przy tym klasa wysokiego poziomu AuthenticationManager nie będzie w żaden sposób naruszona, a jednocześnie będziemy mogli rozszerzyć jej funkcjonalność.
*/

public class AuthenticationManager {

    private INotificationSender iNotificationSender;

    //DependencyInjection
    public AuthenticationManager(INotificationSender notificationSender) {
        this.iNotificationSender = notificationSender;
    }

    public void authenticate(User user, String email, String password) {
        Optional<String> maybeString = Optional.ofNullable(User.create("test@wp.pl").getPassword());
        if (maybeString
                .map(pass -> getRunIfExist(pass, email, password))
                .orElseGet(() -> runIfEmpty())) {
            //EmailNotification.builder().build().sendNotification(user);
            iNotificationSender.sendNotification(user);
        }

    }

    private Boolean getRunIfExist(String userPass, String email, String password) {
        return userPass.equals(email) && userPass.equals(password);
    }

    private Boolean runIfEmpty() {
        return false; //"empty";
    }
}
