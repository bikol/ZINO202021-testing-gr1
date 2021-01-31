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
        System.out.println("potegowanie6");
        String a = new String("three");
        String b = new String("two");
        Arytmetyka instance = new Arytmetyka();
        String expResult = "9";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotegowanie7() {
        System.out.println("potegowanie7");
        String a = new String("4");
        String b = new String("0.5");
        Arytmetyka instance = new Arytmetyka();
        String expResult = "2";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotegowanie8() {
        System.out.println("potegowanie8");
        String a = "3";
        String b = "10";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "59049";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testPotegowanie9() {
        System.out.println("potegowanie9");
        String a = new String("five");
        String b = "1";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "5";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testPotegowanie10() {
        System.out.println("potegowanie10");
        String a = "2";
        String b = "-1";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "0.5";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
	@Test
    public void testPotegowanie11() {
        System.out.println("potegowanie11");
        String a = "0";
        String b = "0";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "Wyrażenie nieoznaczone";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }
	@Test
    public void testPotegowanie12() {
        System.out.println("potegowanie12");
        String a = "-two";
        String b = "-one";
        Arytmetyka instance = new Arytmetyka();
        String expResult = "-0.5";
        String result = instance.potegowanie(a, b);
        assertEquals(expResult, result);
    }

}
