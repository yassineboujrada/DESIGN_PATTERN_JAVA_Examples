package Commande;

public class Client {
    public static void main(String[] args) {
//        RemoteControll rc = new RemoteControll();
//
//        light light = new light();
//        TurnOn_light on_light = new TurnOn_light(light);
//        TurnOff_light off_light = new TurnOff_light(light);
//
//        Tv tv = new Tv();
//        TurnOn_tv on_tv = new TurnOn_tv(tv);
//        TurnOff_tv off_tv = new TurnOff_tv(tv);
//
//        rc.addCommande(0,on_light,off_light);
//        rc.addCommande(1,on_tv,off_tv);
//
//        rc.onBtnPressed(0);
//        rc.onBtnPressed(1);
//
//        rc.offBtnPressed(0);
//        rc.offBtnPressed(1);

        RemoteControll remoteControl = new RemoteControll();

        light light = new light();
        TurnOn_light turnOnLightCommand = new TurnOn_light(light);
        TurnOff_light turnOffLightCommand = new TurnOff_light(light);

        Tv tv = new Tv();
        TurnOn_tv turnOnTVCommand = new TurnOn_tv(tv);
        TurnOff_tv turnOffTVCommand = new TurnOff_tv(tv);

        music_player musicPlayer = new music_player();
        TurnOn_music turnOnMusicCommand = new TurnOn_music(musicPlayer);
        TurnOff_music turnOffMusicCommand = new TurnOff_music(musicPlayer);

        remoteControl.addCommande(0, turnOnLightCommand, turnOffLightCommand);
        remoteControl.addCommande(1, turnOnTVCommand, turnOffTVCommand);
        remoteControl.addCommande(2, turnOnMusicCommand, turnOffMusicCommand);


        System.out.println(remoteControl);


        System.out.println("------ Executing Commands ------");
        remoteControl.onBtnPressed(0);
        remoteControl.onBtnPressed(1);

        remoteControl.offBtnPressed(0);
        remoteControl.offBtnPressed(1);

        remoteControl.onBtnPressed(2);

        System.out.println("------ Undoing Commands ------");

        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();

    }
}
