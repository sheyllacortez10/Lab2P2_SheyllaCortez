/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_sheyllacortez;

import java.util.ArrayList;
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
    static ArrayList <Usuario> usuarito = new ArrayList<>();  
    public static void main(String[] args) {
        //Estudiante
        Usuario estudiante = new Usuario("josue2", "123", "estudiante");
        usuarito.add(estudiante);
        //Profesor
        Usuario profesor = new Usuario("mrmanuel", "456", "profesor");
        usuarito.add(profesor);
        //Bliotecario
        Usuario bibliotecario = new Usuario("biblioaxel", "678", "blibiotecario");
        usuarito.add(bibliotecario);
        
        //Log in
        System.out.println("Ingrese su username: ");
        String username = entrada.nextLine();
        System.out.println("Ingrese su contrasena: ");
        String pass = entrada.nextLine();
        
        String tipoUsu2 = " ";
        for (int i = 0; i < usuarito.size(); i++) {
            if ((usuarito.get(i).getNameUsu().equals(username)) && ((usuarito.get(i).getContrasena().equals(pass)))) {
                tipoUsu2 = usuarito.get(i).getTipoUsu();
            }
        }
        
        //Menú
        switch (tipoUsu2) {
            case "estudiante":

                break;
            case "profesor":

                break;
            case "bibliotecario":

                break;
            default:
                throw new AssertionError();
        }


    }
    
}
