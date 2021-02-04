package com.narine;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Boss thanos = new Boss ();
        thanos.setHealth(700);
        thanos.setDamage(50);
        thanos.setDefence("Galactic");
        System.out.println("Boss: health " + thanos.getHealth() +
                ", damage " + thanos.getDamage() + ", defence " + thanos.getDefence());

        System.out.println("----------------------");

        createHeroes();
        for (Hero current: createHeroes()) {
            System.out.println("Hero: " + current.getName() );
            System.out.println("Health: " + current.getHealth());
            System.out.println("Damage: " + current.getDamage());
            if (current.getSuperPower() == null) {
                System.out.println( "No superpower");
            } else {
                System.out.println("Superpower: " + current.getSuperPower());
            }

            System.out.println("----------------------");
        }
    }

    public static Hero [] createHeroes () {
        Hero ironMan = new Hero(400, 30, "Iron Man");
        Hero doctorStrange = new Hero(300,20,"Magical artifacts", "Doctor Strange");
        Hero thor = new Hero(350, 25,"Divine power", "Thor");

        return new Hero [] {ironMan, doctorStrange, thor};

    }







}
