
/**
 * Driver program for Hero class and subclasses
 *
 * @author Michael Cummings
 * @version 10.26.21
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Knight character1 = new Knight();
        character1.charge();
        character1.getInfoSimple();
        character1.getInfo();
        
        Wizard character2 = new Wizard("J'Zargo", "Khajiit", 20, 155, 167.64);
        character2.castLightningBolt();
        character2.getInfoSimple();
        character2.getInfo();
        
        Thief character3 = new Thief("Garrett", "Human", 26, 170, 180);
        character3.throwSmokeBomb();
        character3.getInfoSimple();
        character3.getInfo();
        
        Druid character4 = new Druid("Saria", "Elf", 24, 120, 165, "Hypnos", "Great Horned Owl", 2.7, 50);
        character4.treebarkShield();
        character4.animalCompanionDefend();
        character4.getInfoSimple();
        character4.getInfo();
    }
}
