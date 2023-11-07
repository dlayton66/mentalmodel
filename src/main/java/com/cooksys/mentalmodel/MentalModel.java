package com.cooksys.mentalmodel;

import com.cooksys.mentalmodel.actors.*;
import com.cooksys.mentalmodel.encounters.Encounter;

public class MentalModel {
  public static void main(String[] args) {
    Player player1 = new Player(20, 10);
    Monster monster = new Monster(10, 10);
    Goblin goblin = new Goblin(1, 10);

//    System.out.println("Player health: " + player1.getHealth());
//    goblin.attack(player1);
//    System.out.println("Player health: " + player1.getHealth());

    Encounter<Goblin> goblinEncounter = new Encounter<>(goblin);
    Encounter<Actor> anyEncounter = new Encounter<>();

    System.out.println(goblinEncounter.printEncounterString());
    System.out.println(anyEncounter.printEncounterString());

    anyEncounter.setEncounterWhat(monster);
    System.out.println(anyEncounter.printEncounterString());

    anyEncounter.setEncounterWhat(player1);
    System.out.println(anyEncounter.printEncounterString());
  }
}
