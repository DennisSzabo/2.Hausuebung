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
    
    public void testFile() throws FileNotFoundException 
    {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter("/n");
        int testLenght = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testLenght; i++) 
        {
            if(scanner.hasNextLine())
            {
                String[] numbers  = scanner.nextLine().split(" ");
                if(numbers.length > 1)
                {
                    int type = Integer.parseInt(numbers[0]);
                    int number = Integer.parseInt(numbers[1]);
                    switch(type)
                    {
                        case 1:
                            
                            if(oddTester.testNumber(number))
                            {
                                System.out.println("ODD");
                            }
                            else
                            {
                                System.out.println("NOT ODD");
                            }
                            break;
                            
                        case 2:
                            
                            if(primeTester.testNumber(number))
                            {
                                System.out.println("PRIME");
                            }
                            else
                            {
                                System.out.println("NOT PRIME");
                            }
                            break;
                            
                        case 3: 
                            
                            if(palindromeTester.testNumber(number))
                            {
                                System.out.println("PALINDROME");
                            }
                            else
                            {
                                System.out.println("NOT PALINDROME");
                            }
                            break;
                            
                            
                    }
                }
            }
        }
    }

    @Override
    public boolean testNumber(int number) 
    {
        return true; 
    }
    
}
