/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author szabo
 */
public class NumberTester implements NumberTest
{
    String fileName;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    
    
    public NumberTester(String fileName)
    {
        this.fileName = fileName;
    }

    NumberTester() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setOddEvenTester(NumberTest oddTester)
    {
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() throws FileNotFoundException, IOException 
    {
        FileReader file = new FileReader("C:\\Users\\szabo\\OneDrive\\Desktop\\Schule\\POS\\2. Hausübung\\Daten.txt");
        BufferedReader br = new BufferedReader(file);
        String zeile1 = br.readLine();
        System.out.println(zeile1);
        String zeile2 = br.readLine();
        System.out.println(zeile2);
        br.close();
    }

    @Override
    public boolean testNumber(int number) 
    {
        return true; 
    }
    
}
