/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Jugador {
    
    public void adivinar(){
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero que hay que adivinar:"));
        
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de intentos: "));
        
        int b = Integer.parseInt(JOptionPane.showInputDialog("Primer intento: "));
        
        for(int i=1;i<=intentos;i++){
            if(b == a){
                JOptionPane.showConfirmDialog(null, "Acertaste");
                break;
            }
            else if (i == intentos) JOptionPane.showMessageDialog(null, "Fallaste, agotaste los intentos");
            else if (a < b) b = Integer.parseInt(JOptionPane.showInputDialog("Otro intento, el numero es menor que " + b));
            else if (a > b) b = Integer.parseInt(JOptionPane.showInputDialog("Otro intento, el numero es mayor que " + b));
        }
    }
}
