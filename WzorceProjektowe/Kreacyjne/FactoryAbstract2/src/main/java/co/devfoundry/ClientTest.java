package co.devfoundry;

import co.devfoundry.units.factory.BlueFactory;
import co.devfoundry.units.factory.Factory;
import co.devfoundry.units.factory.RedFactory;
import co.devfoundry.units.unit.AirUnit;
import co.devfoundry.units.unit.InfantryUnit;
import co.devfoundry.units.unit.MechanizedUnit;
import co.devfoundry.units.unit.UnitType;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        Factory redFactory = new RedFactory();
        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        Factory blueFactory = new BlueFactory();
        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
    }
}