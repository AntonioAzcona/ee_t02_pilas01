/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingresa una cadena de agrupadores");
        Pila miPila = new Pila(4,texto);
        miPila.comparar();
    }
}
