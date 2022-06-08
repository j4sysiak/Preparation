package com.company;

public class Button extends Component {
    public void render(){
        System.out.println("Render button ...");
        // nic dalej nie robimy nie wysyłamy info notyfikacji do mediatora
    }

    public void click() {
        System.out.println("Button click ...");
        this.iMediator.notify(this, "click");
    }
}
