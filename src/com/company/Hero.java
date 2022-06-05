package com.company;


public abstract class Hero{
    double healthPoint, attackDamage, defense, realDamage;
    int level = 1;
    boolean lifeStatus = true;



     void attack(String h1_name, String h2_name, double h1_atk,
                 double h2_def, double h2_health){
         System.out.println("\n\n==="+ h1_name + " Turn ===\n"); spawnIntro();
         reviewDamage(h1_atk, h2_def);
         setRealDamage(h2_health - getRealDamage());

         if(getRealDamage() <= 0){
             setRealDamage(0);
         }
         System.out.printf(h2_name + " HP Remaining\t: %.1f\n",getRealDamage());

     }

     void reviewDamage(double attackDamage, double defense){
        setRealDamage(attackDamage - defense);
     }

     abstract void spawnIntro();
//     abstract void h_Stats(int level);

     void checkStatus(String hero){
         System.out.println("==="+hero+"==="); spawnIntro();
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
}

