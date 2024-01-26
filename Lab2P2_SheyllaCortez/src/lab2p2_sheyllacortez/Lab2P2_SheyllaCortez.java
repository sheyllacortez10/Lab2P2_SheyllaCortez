/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_sheyllacortez;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab2P2_SheyllaCortez {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        
        
        
        
        int opcion = 1;
        while (opcion != 4) {
            System.out.println("Ingrese una opcion a ejecutar: ");
            System.out.println("1). Registrar Usuario ");
            System.out.println("2). Lista Todo ");
            System.out.println("3). Listar Por Dominio ");
            System.out.println("4). Salir del programa ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
