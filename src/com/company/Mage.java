package com.company;



public class Mage extends Hero implements DamageUp {

    double healthPoint = 2500,defense = 200,attackDamage = 700 + (700 * magicDamageBonus);
    final double upatk = 35, upHP = 85, upDef = 10;
    String name = "Mage";


    Mage(int level) {
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
        System.out.println("Behold the power of my magic!");
    }
}