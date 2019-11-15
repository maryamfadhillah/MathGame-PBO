/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrller_model;

/**
 *
 * @author Ahmad Arif Pradana
 */
public class Soal {
    
    //Overloading method
     public String formatPrint(int bilangan1, int bilangan2) {
        String printA = "";
        String printB = "";
        if (bilangan1 < 0) {
            printA += "(" + String.valueOf(bilangan1) + ")";
        } else {
            printA += String.valueOf(bilangan1);
        }
        if (bilangan2 < 0) {
            printB += "(" + String.valueOf(bilangan2) + ")";
        } else {
            printB += String.valueOf(bilangan2);
        }
        return "Hasil dari " + printA + " + " + printB + " = ";
    }

    public String formatPrint(int bilangan1, int bilangan2, boolean status) {
        String printA = "";
        String printB = "";
        if (status) {
            if (bilangan1 < 0) {
                printA += "(" + String.valueOf(bilangan1) + ")";
            } else {
                printA += String.valueOf(bilangan1);
            }
            if (bilangan2 < 0) {
                printB += "(" + String.valueOf(bilangan2) + ")";
            } else {
                printB += String.valueOf(bilangan2);
            }
            return "Hasil dari " + printA + " - " + printB + " = ";
        } else {
            return null;
        }
    }
}
