package com.cooksys.mentalmodel.actors;

public class Goblin extends Monster {
  public Goblin(int health, int damage) {
    super(health, damage);
  }

  @Override
  public String toString() { return "Goblin"; }

//  @Override
//  public void attack(Actor target) {
//    target.setHealth(target.getHealth() - 9000);
//  }
}