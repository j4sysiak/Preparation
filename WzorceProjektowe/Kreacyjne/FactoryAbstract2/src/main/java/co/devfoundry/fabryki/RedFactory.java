package co.devfoundry.fabryki;

import co.devfoundry.unit.InfantryUnit;
import co.devfoundry.unit.MechanizedUnit;
import co.devfoundry.Helicopter;
import co.devfoundry.Rifleman;
import co.devfoundry.Tank;
import co.devfoundry.unit.AirUnit;
import co.devfoundry.unit.UnitType;

public class RedFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helicopter(20, 0, 30);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
