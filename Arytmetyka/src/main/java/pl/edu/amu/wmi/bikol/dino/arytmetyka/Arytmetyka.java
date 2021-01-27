/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */

public class Arytmetyka {

    public String convertTextToNumberText(String a) {
        if (a.equals("two")) {
            return "2";
        } else if (a.equals("three")) {
            return "3";
        } else if (a.equals("four")) {
            return "4";
        }else {
            return a;
        }
    }
  
    public String potegowanie(String a, String b){
        return Integer.toString((int)Math.pow(Double.parseDouble(convertTextToNumberText(a)), Double.parseDouble(convertTextToNumberText(b))));
    }
}