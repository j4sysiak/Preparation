package co.devfoundry;

import co.devfoundry.chef.Chef;
import co.devfoundry.chef.egg_cooker.HardBoiledEggCooker;
import co.devfoundry.chef.egg_cooker.SoftBoiledEggCooker;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {
        Chef chef = new Chef();

        //Nowe zamówienie - jajka na twardo!
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        //Nowe zamówienie - jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }

}
