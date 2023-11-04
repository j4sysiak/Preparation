package co.devfoundry;

import co.devfoundry.house.BigIHouseBuilder;
import co.devfoundry.house.House;
import co.devfoundry.house.HouseDirector;
import co.devfoundry.house.SmallIHouseBuilder;

public class ClientTest {

    @org.junit.Test
    public void test() {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        SmallIHouseBuilder smallHouseBuilder = new SmallIHouseBuilder();
        BigIHouseBuilder bigHouseBuilder = new BigIHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();
        House smallHouse = smallHouseDirector.getHouse();
        System.out.println(smallHouse);

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();
        House bigHouse = bigHouseDirector.getHouse();
        System.out.println(bigHouse);
    }
}
