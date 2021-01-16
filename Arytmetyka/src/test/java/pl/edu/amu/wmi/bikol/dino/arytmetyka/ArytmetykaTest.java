/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class ArytmetykaTest {
    
    public ArytmetykaTest() {
    }

    @Test
    public void testPotegowanie1() {
        System.out.println("potegowanie1");
        String a = "1";
        String b = "1";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "1";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotegowanie2() {
        System.out.println("potegowanie2");
        String a = "0";
        String b = "1";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "0";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotegowanie3() {
        System.out.println("potegowanie3");
        String a = "2";
        String b = "2";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "4";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotegowanie4() {
        System.out.println("potegowanie4");
        String a = "two";
        String b = "two";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "4";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotegowanie5() {
        System.out.println("potegowanie5");
        String a = new String("two");
        String b = new String("two");
        Arytmetyka instance = new Arytmetyka();
        String expResult = "4";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }

  
    @Test
    public void testPotegowanie6() {
        System.out.println("potegowanie5");
        String a = new String("three");
        String b = new String("two");
        Arytmetyka instance = new Arytmetyka();
        String expResult = "4";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
}

    
}

