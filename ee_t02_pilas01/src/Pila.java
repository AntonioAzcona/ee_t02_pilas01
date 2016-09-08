/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class Pila {
    String [] pila;
    Integer apuntador;
    Integer tam;
    Integer aux;
    
    public Pila(Integer tamanio){
        apuntador = -1;
        pila = new String[tamanio];
        tam = tamanio;
        aux = 0;
    }
    
    public void push(String cadena){//En éste método agrego a la pila una cadena y la separo caracteres para ir metiendo cada uno a la pila
        if(apuntador < tam-1){
            apuntador++;
            for(int i = 0; i < pila.length; i++){
                pila[apuntador] = ""+cadena.charAt(i);
                
                System.out.print(cadena.charAt(i));
            }
        }
    }
    public void comparar(){
        for (int i = 0; i < pila.length; i++) {
            
        }
    }
}
