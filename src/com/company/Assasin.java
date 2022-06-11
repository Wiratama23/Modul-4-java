package com.company;

public class Assasin extends Hero implements DamageUp {

    double healthPoint = 3000,defense = 300,attackDamage = 800 +(800 * bonusDamage);
    final double upatk = 30, upHP = 90, upDef = 15;
    String name = "Assasin";

    Assasin(int level) {
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
        System.out.println("Unseen and unheard.");
    }
}
