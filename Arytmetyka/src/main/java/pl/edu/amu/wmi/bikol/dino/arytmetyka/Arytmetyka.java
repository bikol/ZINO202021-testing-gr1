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
        } else if (a.equals("five")){
            return "5";
        } else if (a.equals("six")){
            return "6";
        }
        else {
            return a;
        }
    }
  
	public String potegowanie(String a, String b){
        double a_ = Double.parseDouble(convertTextToNumberText(a));
        double b_ = Double.parseDouble(convertTextToNumberText(b));
        if (a_==0 && b_==0){
            return ("Wyrażenie nieoznaczone");
        }
        if(b_<0){
            return Double.toString(Math.pow(a_,b_));
        }
        else return Integer.toString((int)Math.pow(a_,b_));
    }
}