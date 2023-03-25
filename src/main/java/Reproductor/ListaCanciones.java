/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

import java.util.Scanner;
import listas.Lista;
import listas.Nodo;

/**
 *
 * @author USUARIO
 */
public class ListaCanciones {
     NodoMusic primero;
    public ListaCanciones(){
        primero= null;
    }
    private int leerCancion(){
        System.out.println("ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    public Lista crearCancion(){
        int x=0;
        primero = null;
        do{
           x= leerCancion();
           if(x !=-1){
               primero = new Nodo(x,primero);
           }
        }while (x!=-1);
        return this;
    }

      public Lista insertarLista(int testigo,int entrada){//testigo= valor a buscar  el nodo en la lista
        NodoMusic nuevo,anterior;
        anterior= buscarLista(testigo);
        if(anterior != null){
            nuevo = new NodoMusic(entrada);
            nuevo.enlace= anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }
       public void visualizar(){//hace un recorrido recursivo
        NodoMusic n;
        int k=0;
        n= primero;
        while(n!= null){//mientras n sea diferente a nullo porque cunado llegue a null esta llegando al ultimo elemento
            System.out.println(n.ubicacion+"");
            n = n.enlace;
            k++;
            System.out.print((k%15 !=0 ? "": "\n"));
        }
          public Nodo buscarLista(int destino){
        Nodo indice;
        for(indice = primero; indice !=null; indice = indice.enlace);
        if(destino == indice.dato){
            return indice;
        }
        return null;
}
