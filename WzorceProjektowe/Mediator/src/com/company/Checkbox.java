package com.company;

public class Checkbox extends Component {

    public void select(){
        System.out.println("Checkbox selected");
        this.iMediator.notify(this, "checkboxSelected");
    }

    public void saveValue() {
        System.out.println("Checkbox value save ...");
    }
}
