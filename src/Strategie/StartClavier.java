package Strategie;

import java.util.Scanner;

public class StartClavier implements Strategie{
    

    public Coup detreminerCoup()
    {
        Scanner sc = new Scanner(System.in);
        String laSaisieDuCoup = sc.nextLine();

        while (Coup.isValide(laSaisieDuCoup)==false)
        {
            System.out.print("Coup invalide, veuillez resaisir : ");
            laSaisieDuCoup = sc.nextLine();
        }

        return Coup.fromString(laSaisieDuCoup);
    }
    
}
