package co.devfoundry.house;

public interface IHouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void biuldDoors();
    void buildGarage();

    House getHouse();

}
