package Commande;

public class TurnOn_music implements commande_iterface{
    private music_player music;

    public TurnOn_music(music_player music){
        this.music = music;
    }

    @Override
    public void execute() {
        this.music.turnOn();
    }

    @Override
    public void undo() {
        this.music.turnOff();
    }
}
