package com.company;

public class Tank extends Hero {

    double healthPoint = 7000,defense = 500,attackDamage = 500;
    final double upatk = 20, upHP = 200, upDef = 15;
    String name = "Tank";


    Tank(int level) {
        setLevel(level);
        setDefense(defense);
        setHealthPoint(healthPoint);
        setAttackDamage(attackDamage);
        setName(name);

        for(int i = 1; i<level; i++){
            setAttackDamage(getAttackDamage() + upatk);
            setHealthPoint(getHealthPoint() + upHP);
            setDefense(getDefense() + upDef);
        }
    }

//    @Override
//    public void h_Stats(int level) {
//        for(int i = 1; i<level; i++){
//            setAttackDamage(getAttackDamage() + upatk);
//            setHealthPoint(getHealthPoint() + upHP);
//            setDefense(getDefense() + upDef);
//        }
//    }


    @Override
    public void spawnIntro(){
        System.out.println("Kill me if you can!");
    }
}