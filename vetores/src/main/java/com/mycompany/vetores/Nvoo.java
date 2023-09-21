/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetores;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Nvoo {
    public int[] numVoo = new int[30];
    public String[] horaVoo = new String[30];
    
    public void listaNumHoraVoo(){
    Scanner scanner = new Scanner(System.in);    
    for(int i=0;i<30;i++){
        System.out.print("Numero do voo:");
        numVoo[i] = scanner.nextInt();
        System.out.print("hora do voo:");
        horaVoo[i] = scanner.next();
        }
    for(int i=0;i<30;i++){
        System.out.println("Numeros dos voos:" + numVoo[i] + "hora dos voos" + horaVoo[i]);
    }
   
}
}