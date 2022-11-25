package Commande;

public class TurnOff_music implements commande_iterface{
    private music_player music;

    public TurnOff_music(music_player music){
        this.music = music;
    }

    @Override
    public void execute() {
        this.music.turnOff();
    }

    @Override
    public void undo() {
        this.music.turnOn();
    }
}
