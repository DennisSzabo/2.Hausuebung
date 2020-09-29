/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

import java.util.ArrayList;

/**
 *
 * @author szabo
 */
public class HalloJavaMitForEach 
{
    ArrayList<String> liste = new ArrayList<>();
    
    public void ausgabeListe()
    {
        liste.add("Hallo");
        liste.add("Was");
        liste.add("geht");
        liste.add("?");
        
        for (int i = 0; i < liste.size(); i++) 
        {
            System.out.println(liste);
        }
        
        
    }
    
    
}
