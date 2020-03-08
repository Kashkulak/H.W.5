package com.company;

public class Hero {
    private int heroHealth;
    private int damage;
    private int superPower;
    private String name;

    public Hero(String name, int heroHealth, int damage, int superPower) {
        this.name = name;
        this.heroHealth = heroHealth;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero() {
    }

    public Hero(String name, int heroHealth, int damage) {
        this.name = name;
        this.heroHealth = heroHealth;
        this.damage = damage;
    }

    public String getName() {
        return name;
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

    public void printInfo() {
        System.out.println("Name: "+getName()+"\nHealth: " + getHeroHealth() + "\nDamage: " + getDamage() + "\nSuper power:" + getSuperPower());
    }

    public void printInfo2() {
        System.out.println("Name: "+getName()+"\nHealth: " + getHeroHealth()+ "\nDamage: " + getDamage());
    }
}
