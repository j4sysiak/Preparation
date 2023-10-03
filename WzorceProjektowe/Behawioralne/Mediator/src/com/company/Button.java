package com.company;

public class Button extends Component {

    public void click() {
        System.out.println("Button click ...");
        this.iMediator.notify(this, "click");
    }

    public void render(){
        System.out.println("Render button ...");
        // i  nic dalej nie robimy nie wysyłamy info notyfikacji do mediatora
        // nie informujemy innych komponentów (przy użyciu mediatora) o tym zdareniu
    }
}
