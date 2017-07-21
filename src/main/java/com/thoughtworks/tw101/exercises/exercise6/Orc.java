package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by angelicaperez on 7/17/17.
 */
public class Orc implements Monster {
    private int hitpoints;
    private String name;

    public Orc() {
        hitpoints = 20;
        name = "Unnamed";
    }
    public Orc(String name) {
        hitpoints = 20;
        this.name = name;
    }
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }
    public void reportStatus() {
        System.out.printf("Orc %s has %d hitpoints\n", name, hitpoints);
    }
}
