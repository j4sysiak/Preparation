package co.devfoundry.house;

public class HouseDirector {

    private IHouseBuilder ihouseBuilder;

    public HouseDirector(IHouseBuilder IHouseBuilder) {
        this.ihouseBuilder = IHouseBuilder;
    }

    public void buildHouse(){
        ihouseBuilder.buildWalls();
        ihouseBuilder.buildFloors();
        ihouseBuilder.buildRooms();
        ihouseBuilder.buildRoof();
        ihouseBuilder.buildWindows();
        ihouseBuilder.biuldDoors();
        ihouseBuilder.buildGarage();
    }

    public House getHouse(){
        return this.ihouseBuilder.getHouse();
    }

}
