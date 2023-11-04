package co.devfoundry;

import co.devfoundry.house.BigIHouseBuilder;
import co.devfoundry.house.House;
import co.devfoundry.house.HouseDirector;
import co.devfoundry.house.SmallIHouseBuilder;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        SmallIHouseBuilder smallHouseBuilder = new SmallIHouseBuilder();
        BigIHouseBuilder bigHouseBuilder = new BigIHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }

}
