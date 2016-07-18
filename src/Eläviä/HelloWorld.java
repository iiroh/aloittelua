/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eläviä;

/**
 *
 * @author iiro
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        Human h1= new Human();
        Human h2= new Human(2,"iiro");
        
System.out.println(h1.getStrength());
h2.esittäydy();
h1.esittäydy();




    }
    
}
