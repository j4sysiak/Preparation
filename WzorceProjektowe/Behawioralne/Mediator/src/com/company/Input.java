package com.company;

public class Input extends Component {

    public void select(){
        System.out.println("Input selected");
        this.iMediator.notify(this, "insertText");
    }

    public void saveValue() {
        System.out.println("Save Inserted Text...");
        //  i  nic dalej nie robimy nie wysyłamy info notyfikacji do mediatora
        // nie informujemy innych komponentów (przy użyciu mediatora) o tym zdareniu
    }
}
