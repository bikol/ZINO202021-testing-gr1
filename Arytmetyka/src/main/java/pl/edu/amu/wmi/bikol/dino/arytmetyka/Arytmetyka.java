/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bikol
 */

public class Arytmetyka { 

    public String convertTextToNumberText(String a) {
        int sgn;
		double var;
        List<String> word = Arrays.asList("one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten");
				
		if (a.contains("/")) {
		String[] rat = a.split("/");

		var =  Double.parseDouble(rat[0])/Double.parseDouble(rat[1]);
		System.out.print(Double.toString(var));

		return Double.toString(var);

		}

        if (a.matches("-[^0-9]+")){
            sgn = -1;
            a = a.substring(1);
        } else {
            sgn = 1;
        };

        if (word.contains(a)){
            return Integer.toString((word.indexOf(a) + 1) * sgn);
        } else {
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
