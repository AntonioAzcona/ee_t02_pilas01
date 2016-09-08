/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AZCONA GONZÁLEZ JOSÉ ANTONIO
 * Materia: Estructura de Datos
 * Docente: Lic. León Felipe Villavicencio Fernandez
 * Hora: 10:00 - 11:00
 * Nombre del trabajo: Tarea02
 */
public class Pila {
    String [] pila; //Declaro mi arreglo llamado pila
    Integer tope;//Variables
    Integer tam;
    String cadena;
    
    public Pila(Integer tamanio, String cad){ 
        tope = -1;
        pila = new String[tamanio];
        tam = tamanio;
        cadena = cad;
    }
    public void push(char dato){ //Este metodo me permite insertar en éste caso un caracter entero a mi pila
        if(tope < tam-1){ 
            tope++;
            pila[tope] = ""+dato;
        }else{
            System.out.println("Desbordamiento");
        }
    }
    
    public char pop(){ //Lo puse char por que así podra quitar caracter por caracter
        String var = pila[tope];
        char resultado = 0;
        if(tope > -1){
            resultado = var.charAt(0);
            pila[tope] = null;
            tope--;
        }else{
            System.out.println("Subdesbordamiento");
        }
        return resultado;
    }
    
    public String peek(){
        String resultado = null;
        if(tope > -1){
            resultado = pila[tope];
        }else{
            System.out.println("Subdesbordamiento");
        }
        return resultado;
    }
    
    public void comparar(){
        int valanceado=cadena.length();
        if(!(valanceado%2==0))
        {
            System.out.println("NO");
            return;
        }
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == '{'){ 
               push(cadena.charAt(i));
            }else{
               if(cadena.charAt(i) == '}'){
                   /*if(estaVacia()){
                       System.out.println("NO");
                       return;
                   }*/
                   if(pop() == '{')
                   {}else{
                  System.out.println("NO");
                  break;
                  }
               }
            }
            if(cadena.charAt(i) == '['){
               push(cadena.charAt(i));
            }else{
               if(cadena.charAt(i) == ']'){
                   /*if(estaVacia()){
                       System.out.println("NO");
                       return;
                   }*/
                  if(pop() == '['){
                  //System.out.println("Encontro");
                  }else{
                  System.out.println("NO");
                  break;
                  }
               }
            }
            if(cadena.charAt(i) == '('){
               push(cadena.charAt(i));
            }else{
               if(cadena.charAt(i) == ')'){
                   /*if(estaVacia()){
                       System.out.println("NO");
                       return;
                   }*/
                  if(pop() == '('){
                  //System.out.println("Encontro");
                  }else{
                  System.out.println("NO");
                  break;
                  }
               }
            }
       }
        if(!estaVacia())
            System.out.println("NO");
        else
        System.out.println("SI");
    }
    public boolean estaVacia(){
          return tope == -1;
    }
}
