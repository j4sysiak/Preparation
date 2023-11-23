package co.devfoundry;

public class SavedGameProxy implements SavedGame {

    private String name;
    private SavedGame sg;  // docelowo ma być obiekt SavedGameFull


    @Override
    public void initialize() {
        this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();  // tworzymy pełny obiekt docelowz
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
