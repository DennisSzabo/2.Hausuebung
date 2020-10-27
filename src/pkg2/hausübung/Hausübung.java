/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author szabo
 */
public class Hausübung {

    
    public static void main(String[] args) throws FileNotFoundException 
    {
       /* NumberTester nt = new NumberTester("Daten.txt");
        nt.setOddEvenTester((int number) -> number % 2 == 0);
        nt.setPrimeTester((int number) -> nt.testNumber(number));
        nt.setPalindromeTester((int number) ->
        {
            String stringNumber = ""+number;
            String reverse = "";                                                Aufgabe 2
            int stringLenght = stringNumber.length();
            for (int i = stringLenght - 1 ; i <= 0; i--) 
            {
                reverse += stringNumber.charAt(i);
                
            }
            return stringNumber.equals(reverse);
        });
        nt.testFile();*/
        
        
        
        
        
        boolean beenden = false;
        AbstractCalculator ac = null;
        while(beenden == false)
        {
            Scanner s = new Scanner(System.in);
            s.useDelimiter("\n");
            System.out.println("-------------------------------------------");
            System.out.println("Choose Calculator:");
            System.out.println("1 - Relational calculator"); //Brüche rechnen
            System.out.println("2 - Vector calculator"); //Vektoren rechnen
            System.out.println("3 - Complex calculator"); //Komplexe rechnen
            System.out.println("4 - Exit Program");
            int calculator = s.nextInt();
            
            switch(calculator)
            {
                case 1:
                    ac = new RationalCalculator(
                                (a,b) -> {return new Number(a.getA() + b.getA(), a.getB());}, 
                                (a,b) -> {return new Number(a.getA() - b.getA(), b.getB());}, 
                                (a,b) -> {return new Number(a.getA() * b.getB(), a.getB() * b.getB());}, 
                                (a,b) -> {return new Number(a.getA() * b.getB(), a.getB() * b.getA());}
                        );
                    break;
                
                case 2:
                    ac = new VectorCalculator(
                                (a,b) -> {return new Number(a.getA() + b.getA(), b.getB() + a.getB());}, 
                                (a,b) -> {return new Number(a.getA() - b.getA(), b.getB() - a.getB());}, 
                                (a,b) -> {return new Number(a.getA() * b.getB(), b.getA() * a.getB());}, 
                                (a,b) -> {return new Number(a.getA() * a.getB(), b.getA() * b.getB());}
                        );
                    break;
                
                case 3:
                    ac = new ComplexCalculator(
                                (a,b) -> {return new Number(a.getA() + b.getA(), b.getB() + a.getB());}, 
                                (a,b) -> {return new Number(a.getA() - b.getA(), b.getB() - a.getB());}, 
                                (a,b) -> {return new Number((a.getA() * b.getA()) - (a.getB() * b.getB()), (a.getA() * b.getB()) + (a.getB() * b.getA()) );}, 
                                (a,b) -> {return new Number(
                                        ((a.getA() * b.getA()) + (a.getB() * b.getB()))
                                            /
                                        ((b.getA() * b.getA()) + (b.getB() * b.getB()))
                                        ,
                                        ((a.getB() * b.getA()) - (a.getA() * b.getB()))
                                            /
                                        ((b.getA() * b.getA()) + (b.getB() * b.getB()))
                                        );});
                            
                    
                    break;
                 
                case 4:
                    System.exit(0);
                    break;
            } 
            
            System.out.println("Enter x a");
            int xa = s.nextInt();
            System.out.println("Enter x b");
            int xb = s.nextInt();
            System.out.println("Enter y a");
            int ya = s.nextInt();
            System.out.println("Enter y b");
            int yb = s.nextInt();
        
            System.out.println("Choose operation:");
            System.out.println("1 - add");
            System.out.println("2 - subtract");
            System.out.println("3 - multiply");
            System.out.println("4 - divide");
            System.out.println("5 - Enter numbers again");
            int operation = s.nextInt();
            while(operation == 5)
            {
                System.out.println("Enter x a");
                xa = s.nextInt();
                System.out.println("Enter x b");
                xb = s.nextInt();
                System.out.println("Enter y a");
                ya = s.nextInt();
                System.out.println("Enter y b");
                yb = s.nextInt();
                        
                System.out.println("Choose operation:");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - Enter numbers again");
                operation = s.nextInt();
            }
            
            System.out.println("-------------------------------------------");
            System.out.println("Solution:");
            
            switch(operation)
            {
                case 1:
                    Number n = ac.add(new Number(xa, xb), new Number(ya, yb));
                    if(calculator == 1)
                    {
                        System.out.println("Zähler = "+n.getA());
                        System.out.println("Nenner = "+n.getB());
                        
                    }
                    else if(calculator == 2)
                    {
                        System.out.println("a = "+n.getA());
                        System.out.println("b = "+n.getB());
                    }
                    else
                    {
                        String z = n.getA()+" + "+n.getB()+"i";
                        System.out.println("z = "+z);
                    }
                    break;
                
                case 2:
                    n = ac.subtract(new Number(xa, xb), new Number(ya, yb));
                    if(calculator == 1)
                    {
                        System.out.println("Zähler = "+n.getA());
                        System.out.println("Nenner = "+n.getB());
                        
                    }
                    else if(calculator == 2)
                    {
                        System.out.println("a = "+n.getA());
                        System.out.println("b = "+n.getB());
                    }
                    else
                    {
                        String z = n.getA()+" + "+n.getB()+"i";
                        System.out.println("z = "+z);
                    }
                    break;
                    
                case 3:
                    n = ac.multiply(new Number(xa, xb), new Number(ya, yb));
                    if(calculator == 1)
                    {
                        System.out.println("Zähler = "+n.getA());
                        System.out.println("Nenner = "+n.getB());
                        
                    }
                    else if(calculator == 2)
                    {
                        System.out.println("v = "+(n.getA() - n.getB()));
                    }
                    else
                    {
                        String z = n.getA()+" + "+n.getB()+"i";
                        System.out.println("z = "+z);
                    }
                    break;
                
                case 4:
                    n = ac.divide(new Number(xa, xb), new Number(ya, yb));
                    if(calculator == 1)
                    {
                        System.out.println("Zähler = "+n.getA());
                        System.out.println("Nenner = "+n.getB());
                        
                    }
                    else if(calculator == 2)
                    {
                        System.out.println("v = "+(n.getA() + n.getB()));
                    }
                    else
                    {
                        String z = n.getA()+" + "+n.getB()+"i";
                        System.out.println("z = "+z);
                    }
                    break;
                   
            }
        }
    }
    
}
