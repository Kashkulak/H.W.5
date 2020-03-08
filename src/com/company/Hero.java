package com.company;

public class Hero {
    public int heroHealth;
    private int damage;
    private int superPower;

    public Hero(int heroHealth, int damage, int superPower) {
        this.heroHealth = heroHealth;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int heroHealth, int damage) {
        this.heroHealth = heroHealth;
        this.damage = damage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperPower() {
        return superPower;
    }
}
