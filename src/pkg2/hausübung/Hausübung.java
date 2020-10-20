/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

import java.io.FileNotFoundException;

/**
 *
 * @author szabo
 */
public class Hausübung {

    
    public static void main(String[] args) throws FileNotFoundException 
    {
        NumberTester nt = new NumberTester("Daten.txt");
        nt.setOddEvenTester((int number) -> number % 2 == 0);
        nt.setPrimeTester((int number) -> nt.testNumber(number));
        nt.setPalindromeTester((int number) ->
        {
            String stringNumber = ""+number;
            String reverse = "";
            int stringLenght = stringNumber.length();
            for (int i = stringLenght - 1 ; i <= 0; i--) 
            {
                reverse += stringNumber.charAt(i);
                
            }
            return stringNumber.equals(reverse);
        });
        nt.testFile();
    }
    
}
