package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by angelicaperez on 7/17/17.
 */
public class Troll implements Monster {
    private int hitpoints;
    private String name;

    public Troll() {
        hitpoints = 40;
        name = "Unnamed";
    }
    public Troll(String name) {
        hitpoints = 40;
        this.name = name;
    }
    public void takeDamage(int amount) {
        hitpoints -= amount/2;
    }
    public void reportStatus() {
        System.out.printf("Troll %s has %d hitpoints\n", name, hitpoints);
    }
}
