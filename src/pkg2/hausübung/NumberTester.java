/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

/**
 *
 * @author szabo
 */
public class NumberTester 
{
    String fileName;
    NumberTester oddTester;
    NumberTester primeTester;
    NumberTester palindromeTester;
    
    public NumberTester(String fileName)
    {
        this.fileName = fileName;
    }
    
    public void setOddEvenTester(NumberTester oddTester)
    {
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTester primeTester)
    {
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTester palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile()
    {
        
    }
    
}
