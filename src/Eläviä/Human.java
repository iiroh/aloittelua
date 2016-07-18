/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eläviä;


/**
 *
 * @author iiro
 * 
 */
public class Human extends Olio
{
private int height;
   


    public Human()
    {
        super ("Ihminen",0);
        height=63;

        System.out.println("Hello World!");
    }
    public Human(int a, String n)
    {
        super(n,a);

        if ("Make".equals(name)) {
            health=40;
            System.out.println("Olen "+name+" ja retardi");
    } else {
            health = 100;
           
    }
        
    }
    
    public void esittäydy(){
    System.out.println("Olen "+name+" ja "+ age+ " vuotta vanha. ("+health+")");
    }
    
    public void speak(){
    System.out.println("Hola!");
    }  
    
    public int getHeight(){
    return height;
    }

   
    
}
