/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szabo
 */
public class HalloJavaMitForEach 
{
    private static List<String> listString = new ArrayList<>();

    public void ausgabeListe()
    {
        ArrayList<String> liste = new ArrayList<>();
        for (int i = 0; i < 10; i++) 
        {
            liste.add(i+"");
        }
        
        for(String s: liste)
        {
            System.out.println(s + " ");
        }
        
        liste.forEach((String s) -> System.out.println(s + " "));
    }
    
    
}
