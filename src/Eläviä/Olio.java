/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eläviä;
 
import java.util.Random;


/**
 *
 * @author iiro
 */
public class Olio{
    protected int health;
    protected int age;
    protected String name;
    protected int strength;
    


    public Olio(String n,int a)
    {
        name=n;
        age=a; 
        health=100;
        
        Random Str = new Random();
        strength=Str.nextInt(10) + 1;
        
    }
        public void takeDamage(int amountOfDamage){
    int d=amountOfDamage;
    int health2 = getHealth()-d;
    setHealth(health2);    
    
        if(health2<= 0){
            System.out.println("KUOLIT!!!");
        }else{
            System.out.println("uusi health on: " + health2);
                }
    }
    public void hitDamage (){
        
        Random damageGen = new Random ();
        int damage= damageGen.nextInt(10)*strength;
    }
    public void speak(String s){
    System.out.println(s);
    }
        
    public int getHealth() {
        return health;
    }
    
    private void setHealth(int h) {
        health = h;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
        
    } 
    
    public int getStrength() {
        return strength;
    }

    private void setStrength(int s) {
        strength = s;
    }
    
}

    