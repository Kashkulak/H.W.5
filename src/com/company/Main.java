package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(300, 75, "Magic");
        boss.printInfo();
        createHeroes();

    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        Hero warrior = new Hero("Warrior",250, 25, 40);
        warrior.printInfo();
        Hero kinetic = new Hero("Kinetic" ,150, 20, 100);
        kinetic.printInfo();
        Hero magic = new Hero("Magic", 200, 30);
        magic.printInfo2();
        heroes[0] = warrior;
        heroes[1] = magic;
        heroes[2] = kinetic;
        return heroes;
    }
}
