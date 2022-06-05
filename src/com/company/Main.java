package com.company;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void mulai() {
        Random rand = new Random();
        Assasin h1 = new Assasin(rand.nextInt(11));
        Tank h2 = new Tank(rand.nextInt(11));
        Mage h3 = new Mage(rand.nextInt(11));

        int round = 0;
        int pick_hero1, pick_hero2;
        // pick hero
        // 1. Assasin
        // 2. Tank
        // 3. Mage
        do{
            pick_hero1 = ThreadLocalRandom.current().nextInt(1, 4);
            pick_hero2 = ThreadLocalRandom.current().nextInt(1, 4);

            if(pick_hero1 == 1 && pick_hero2 == 2 ||
                    pick_hero1 == 2 && pick_hero2 == 1){
                h1.checkStatus("Assasin");
                h2.checkStatus("Tank");
                do {
                    round++;
                    System.out.printf("\n=========== Round  %d ===========", round);

                    //Assasin Turn
                    if (h1.getLifeStatus()) {
                        h1.attack("Assasin", "Tank",
                                h1.getAttackDamage(), h2.getDefense(),
                                h2.getHealthPoint());
                        h2.setHealthPoint(h1.getRealDamage());

                        if (h2.getHealthPoint() <= 0) {
                            h2.setLifeStatus(false);
                        }
                    }

                    //Tank Turn
                    if (h2.getLifeStatus()) {
                        h2.attack("Tank", "Assasin",
                                h2.getAttackDamage(), h1.getDefense(),
                                h1.getHealthPoint());
                        h1.setHealthPoint(h2.getRealDamage());

                        if (h1.getHealthPoint() <= 0) {
                            h1.setLifeStatus(false);
                        }
                    }

                } while (h1.getLifeStatus() && h2.getLifeStatus());
                System.out.println("\n========= Match Result =========");
                if (!h1.getLifeStatus() && h2.getLifeStatus()) {
                    System.out.println("Assasin died in the Game\nTank Win the Game");
                } else {
                    System.out.println("Tank died in the Game\nAssasin Win the Game");
                }
                //end of match
            } else if(pick_hero1 == 1 && pick_hero2 == 3 ||
                    pick_hero1 == 3 && pick_hero2 == 1){
                h1.checkStatus("Assasin");
                h3.checkStatus("Mage");
                do {
                    round++;
                    System.out.printf("\n=========== Round  %d ===========", round);

                    //Assasin Turn
                    if (h1.getLifeStatus()) {
                        h1.attack("Assasin", "Mage",
                                h1.getAttackDamage(), h3.getDefense(),
                                h3.getHealthPoint());
                        h3.setHealthPoint(h1.getRealDamage());

                        if (h3.getHealthPoint() <= 0) {
                            h3.setLifeStatus(false);
                        }
                    }

                    //Mage Turn
                    if (h3.getLifeStatus()) {
                        h3.attack("Mage", "Assasin",
                                h3.getAttackDamage(), h1.getDefense(),
                                h1.getHealthPoint());
                        h1.setHealthPoint(h3.getRealDamage());

                        if (h1.getHealthPoint() <= 0) {
                            h1.setLifeStatus(false);
                        }
                    }
                } while (h1.getLifeStatus() && h3.getLifeStatus());
                System.out.println("\n========= Match Result =========");
                if (!h1.getLifeStatus() && h3.getLifeStatus()) {
                    System.out.println("Assasin died in the Game\nMage Win the Game");
                } else {
                    System.out.println("Mage died in the Game\nAssasin Win the Game");
                }
                //end of match
            } else if(pick_hero1 == 2 && pick_hero2 == 3 ||
                    pick_hero1 == 3 && pick_hero2 == 2){
                h2.checkStatus("Tank");
                h3.checkStatus("Mage");
                do {
                    round++;
                    System.out.printf("\n=========== Round  %d ===========", round);

                    //Assasin Turn
                    if (h2.getLifeStatus()) {
                        h2.attack("Tank", "Mage",
                                h2.getAttackDamage(), h3.getDefense(),
                                h3.getHealthPoint());
                        h3.setHealthPoint(h2.getRealDamage());

                        if (h3.getHealthPoint() <= 0) {
                            h3.setLifeStatus(false);
                        }
                    }

                    //Mage Turn
                    if (h3.getLifeStatus()) {
                        h3.attack("Mage", "Tank",
                                h3.getAttackDamage(), h2.getDefense(),
                                h2.getHealthPoint());
                        h2.setHealthPoint(h3.getRealDamage());

                        if (h2.getHealthPoint() <= 0) {
                            h2.setLifeStatus(false);
                        }
                    }

                } while (h2.getLifeStatus() && h3.getLifeStatus());
                System.out.println("\n========= Match Result =========");
                if (!h2.getLifeStatus() && h3.getLifeStatus()) {
                    System.out.println("Tank died in the Game\nMage Win the Game");
                } else {
                    System.out.println("Mage died in the Game\nTank Win the Game");
                }
                //end of match
            }
        }while(pick_hero1 == pick_hero2);
    }

    public static void main(String[] args) {
        mulai();
    }
}

//set status
//        h1.h_Stats(); h1.update(h1.getLevel());
//        h2.h_Stats(h2.getLevel());
//        h3.h_Stats(); h3.update(h3.getLevel());

//driver
//        h1.checkStatus("Assasin");
//        h2.checkStatus("Mage");
//        h3.checkStatus("Tank");
//        h1.h_Stats(h1.getLevel());
//        h3.h_Stats(h3.getLevel());
