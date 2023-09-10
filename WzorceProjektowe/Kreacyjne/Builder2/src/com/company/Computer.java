package com.company;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Computer {

    private Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
    }

    //required parameters
    private String HDD;


    //Builder Class
    public static class ComputerBuilder{

        // required parameters
        private String HDD;

        public ComputerBuilder setHDD(String hdd) {
            this.HDD = hdd;
            return this;
        }

//        public ComputerBuilder(String hdd){
//            this.HDD=hdd;
//        }

        public Computer build(){
            return new Computer(this);
        }

    }

}