package com.narine;

public class Hero {

    private int health;
    private int damage;
    private String superPower;
    private String name;

    public Hero (int health, int damage, String superPower, String name) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
        this.name = name;

    }

    public Hero (int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getName() {
        return name;
    }
}
