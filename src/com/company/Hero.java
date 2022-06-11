package com.company;


public abstract class Hero{
    double healthPoint, attackDamage, defense, realDamage;
    String name;
    int level = 1;
    boolean lifeStatus = true;


     void attack(Hero target){
         System.out.println("\n\n==="+ getName() + " Turn ===\n"); spawnIntro();
         reviewDamage(getAttackDamage(), target.getDefense());

         if(getRealDamage() >= target.getHealthPoint()){
             target.setHealthPoint(0);
             target.setLifeStatus(false);
         }else{
             target.setHealthPoint(target.getHealthPoint() - getRealDamage());
         }

         System.out.printf(target.getName() + " HP Remaining\t: %.1f\n",target.getHealthPoint());
     }

     void reviewDamage(double attackDamage, double defense){
        setRealDamage(attackDamage - defense);
     }

     abstract void spawnIntro();
//     abstract void h_Stats(int level);

     void checkStatus(){
         System.out.println("==="+getName()+"==="); spawnIntro();
         System.out.printf("Hero Level: %d\n", getLevel());
         System.out.printf("Attack damage\t : %.1f \t\t Life Status : %b\nHealth point\t : %.1f\t\t Defense\t : %.1f\n\n",
                 getAttackDamage(),getLifeStatus(),getHealthPoint(),getDefense());

     }

     //getset method
    public double getRealDamage() {
        return realDamage;
    }

    public void setRealDamage(double realDamage) {
        this.realDamage = realDamage;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

