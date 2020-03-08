package com.company;

public class Boss {
    private int health;
    private int damage;
    private String differenceType;

    public Boss(int health, int damage, String differenceType) {
        this.health = health;
        this.damage = damage;
        this.differenceType = differenceType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = health;
    }

    public void setDifferenceType(String differenceType) {
        this.differenceType = differenceType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDifferenceType() {
        return differenceType;
    }

    public void printInfo() {
        System.out.println("Health:" + getHealth() + "\n" + "Damage:" + getDamage() + "\n" + "DifferenceType:" + getDifferenceType());
    }
}

