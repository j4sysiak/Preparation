package com.company;

public class Checkbox extends Component {

    public void select(){
        System.out.println("Checkbox selected");

        // informujemy inne komponenty (przy użyciu mediatora) o tym zdareniu
        this.iMediator.notify(this, "checkboxSelected");
    }

    public void saveValue() {
        System.out.println("Checkbox value save ...");
        // CLUE:
        //  i  nic dalej nie robimy nie wysyłamy info notyfikacji do mediatora
        //  nie informujemy innych komponentów (przy użyciu mediatora) o tym zdareniu
    }
}
