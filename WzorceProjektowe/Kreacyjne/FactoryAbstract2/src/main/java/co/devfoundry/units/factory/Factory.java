package co.devfoundry.units.factory;

import co.devfoundry.units.unit.AirUnit;
import co.devfoundry.units.unit.InfantryUnit;
import co.devfoundry.units.unit.MechanizedUnit;
import co.devfoundry.units.unit.UnitType;

abstract public class Factory {

    abstract public InfantryUnit createInfantryUnit(UnitType type);

    abstract public MechanizedUnit createMechanizedUnit(UnitType type);

    abstract public AirUnit createAirUnit(UnitType type);
}
