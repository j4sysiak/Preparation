package com.company;

public class Input extends Component {

    public void select(){
        System.out.println("Input selected");
        this.iMediator.notify(this, "insertText");
    }

    public void saveValue() {
        System.out.println("Inserted Text seve...");
    }
}
