/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swords;



/**
 *
 * @author iiro
 */
public class Sword {
    private int impact;
    private String name;

            
    public Sword(String swordName, String material){
        name = swordName;
        switch(material){
        
            case "Steel":
                
                break;
            case "Dragonglass":
                //something
                break;
            case "Valyriansteel":
                //something
                break;
            default: //wood
                //something
                break;
        }
        
        
    
            
    }
    
    public void lyönti(){
    
    }
}
