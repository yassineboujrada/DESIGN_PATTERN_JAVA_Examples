package Commande;

import java.util.LinkedList;

public class RemoteControll {
    private commande_iterface[] onCommande;
    private commande_iterface[] offCommande;
    private LinkedList<commande_iterface> history;

    public RemoteControll(){
        onCommande = new commande_iterface[4];
        offCommande = new commande_iterface[4];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 4; i++) {
            onCommande[i] =noCommand;
            offCommande[i] =noCommand;
        }

        history = new LinkedList<>();
    }

    public void addCommande(int slot,commande_iterface on,commande_iterface off){
        onCommande[slot] = on;
        offCommande[slot] = off;
    }

    public void onBtnPressed(int slot){
        onCommande[slot].execute();
        history.push(onCommande[slot]);
    }

    public void offBtnPressed(int slot){
        offCommande[slot].execute();
        history.push(offCommande[slot]);
    }

    public void undoButtonPressed() {
        if (history.peek() != null) {
            history.poll().undo();
        }else {
            System.out.println("No more history");
        }
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<onCommande.length;i++){
            buffer.append(String.format("[Slot %d] %s \t %s",i,onCommande[i].getClass().getSimpleName(),offCommande[i].getClass().getSimpleName()));
        }

        return buffer.toString();
    }

}
