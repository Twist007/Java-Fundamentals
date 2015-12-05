package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p01_DragonEra {

    public static int dragonsCount = 0;

    enum YearType {
        Bad,
        Normal,
        Good
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDragon = scanner.nextInt();

        List<Dragon> dragons = new ArrayList<>();

        for (int i = 1; i <= numOfDragon; i++) {
            Dragon dragon = new Dragon("Dragon_" + i, 0);

            int eggs = scanner.nextInt();

            for (int eggCounter = 0; eggCounter < eggs; eggCounter++) {
                Egg egg = new Egg(0, dragon);
                dragon.lay(egg);
            }
            dragons.add(dragon);
        }

        dragonsCount = numOfDragon + 1;

        int years = scanner.nextInt();
        for (int year = 1; year <= years; year++) {
            String yearType = scanner.nextLine();
            YearType yearFactor = YearType.valueOf(yearType);

            for (Dragon dragon : dragons) {
                dragon.age();
                dragon.lay();

                for (Egg egg : dragon.getEggs()) {
                    egg.setYearFactor(yearFactor);
                    egg.age();
                    egg.hatch();
                }
            }
        }
    }

    public static void passAge(Dragon dragon, YearType factor) {
        dragon.age();


        for (Egg egg : dragon.getEggs()) {
            egg.setYearFactor(factor);

            egg.age();
            egg.hatch();
        }

        for (Dragon child : dragon.getChildren()){
            passAge(child, factor);
        }
        dragon.lay();
    }

    static class Dragon {
        private static final int AGE_DEATH = 6;
        private static final int AGE_LAY_EGGS_START = 3;
        private static final int AGE_LAY_EGGS_END = 4

        private String name;
        private int age;
        private List<Egg> eggs;
        private boolean isAlive;
        private Dragon[] children;

        public Dragon(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void lay(Egg egg) {
            this.eggs.add(egg);
        }

        public void lay() {
            if (this.age >= AGE_LAY_EGGS_START && this.age <= AGE_LAY_EGGS_END) {
                Egg egg = new Egg(0, this);
                this.eggs.add(egg);
            }
        }

        public void age() {
            if (this.isAlive) {
                this.age++;
            }
            if (this.age == AGE_DEATH) {
                this.isAlive = false;
            }
        }

        //todo
        public void increaseOffspring(Dragon baby) {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Iterable<Egg> getEggs(){
            return this.eggs;
        }

        public Dragon[] getChildren() {
            return children;
        }
    }


    static class Egg {
        private static final int AGE_HATCH = 0;

        private int age;
        private Dragon parent;

        public Egg(int age, Dragon parent) {
            this.age = age;
            this.parent = parent;
        }

        public void age() {
            this.age++;
        }

        public void hatch() {
            if (this.age == AGE_HATCH) {
                int yearFactor = this

                        Dragon baby = new Dragon(

                        this.parent.getName() + "/" + "Dragon_" + p01_DragonEra.dragonsCount, 0);

                this.parent.increaseOffspring(baby);
                p01_DragonEra.dragonsCount++;
            }
        }


        public void setYearFactor(YearType yearFactor) {
            this.yearFactor = yearFactor;
        }
    }
}
