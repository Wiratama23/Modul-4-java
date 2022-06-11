package com.company;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void mulai() {
        Random rand = new Random();
        Hero h1 = new Assasin(rand.nextInt(10)+1);
        Hero h2 = new Tank(rand.nextInt(10)+1);
        Hero h3 = new Mage(rand.nextInt(10)+1);

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
                h1.checkStatus();
                h2.checkStatus();
                do {
                    round++;
                    System.out.printf("\n=========== Round  %d ===========", round);

                    //Assasin Turn
                    if (h1.getLifeStatus()) {
                        h1.attack(h2);
                    }

                    //Tank Turn
                    if (h2.getLifeStatus()) {
                        h2.attack(h1);
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
                h1.checkStatus();
                h3.checkStatus();
                do {
                    round++;
                    System.out.printf("\n=========== Round  %d ===========", round);

                    //Assasin Turn
                    if (h1.getLifeStatus()) {
                        h1.attack(h3);
                    }

                    //Mage Turn
                    if (h3.getLifeStatus()) {
                        h3.attack(h1);
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
                h2.checkStatus();
                h3.checkStatus();
                do {
                    round++;
                    System.out.printf("\n=========== Round  %d ===========", round);

                    //Assasin Turn
                    if (h2.getLifeStatus()) {
                        h2.attack(h3);
                    }

                    //Mage Turn
                    if (h3.getLifeStatus()) {
                        h3.attack(h2);
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
