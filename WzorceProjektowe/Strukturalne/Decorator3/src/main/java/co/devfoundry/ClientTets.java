package co.devfoundry;

public class ClientTets {

    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        //Terrain terrain  = new Plain();
        //Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Plain()));

        System.out.println("SwampDecorator hill cost "+ terrain2.fuelCost());
        System.out.println("SwampDecorator forest plain cost " + terrain3.fuelCost());
    }

}
