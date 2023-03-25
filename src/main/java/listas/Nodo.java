/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    int dato;
    Nodo enlace;
    
    public Nodo(int x){
        dato = x;
        enlace= null;
    }
    public Nodo(int x,Nodo n){
        dato=x;
        enlace= n;
    }
    public int getDato(){
        return dato;
    }
    public Nodo getEnlace(){
        return enlace;
    }
    public void setEnlace(Nodo n){
        enlace=n;
    }
}
