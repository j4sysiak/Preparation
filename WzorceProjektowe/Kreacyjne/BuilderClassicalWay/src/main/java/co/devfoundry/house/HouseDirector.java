package co.devfoundry.house;

public class HouseDirector {

    private IHouseBuilder IHouseBuilder;

    public HouseDirector(IHouseBuilder IHouseBuilder) {
        this.IHouseBuilder = IHouseBuilder;
    }

    public void buildHouse(){
        IHouseBuilder.buildWalls();
        IHouseBuilder.buildFloors();
        IHouseBuilder.buildRooms();
        IHouseBuilder.buildRoof();
        IHouseBuilder.buildWindows();
        IHouseBuilder.biuldDoors();
        IHouseBuilder.buildGarage();
    }

    public House getHouse(){
        return this.IHouseBuilder.getHouse();
    }

}
