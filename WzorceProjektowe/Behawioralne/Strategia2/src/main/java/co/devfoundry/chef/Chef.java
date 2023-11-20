package co.devfoundry.chef;

import co.devfoundry.chef.egg_cooker.EggCooker;

public class Chef {

    private EggCooker eggCooker;

    public void cook() {
        this.eggCooker.cookEgg();
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

}
