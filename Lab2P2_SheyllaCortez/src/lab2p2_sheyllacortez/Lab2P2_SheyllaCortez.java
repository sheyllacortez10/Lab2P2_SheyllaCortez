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
    static ArrayList recursos = new ArrayList();
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
        //Recurcos en duro
        Libro mybook  = new Libro("principito", "JK", "literatura", "09/11/2023", "si");
        recursos.add(mybook);
        Articulos myArticle = new Articulos("Science", "Gabriel Marquez", "particles", "11/09/2012", "si" );
        recursos.add(myArticle);
        CursosOnline mycurso = new CursosOnline("Aprende a programa en java", "Emilio Cantarero", 3, "cursosOnline.com");
        recursos.add(mycurso);
        Conferencias confe = new Conferencias("Programacion", "Ing.Osman Mejia", "09/23/2023", 2, "conference.com");
        recursos.add(confe);
        switch (tipoUsu2) {
            case "estudiante":
                int opcion = 0;
                while (opcion != 1) {
                    System.out.println("Que desea hacer: ");
                    System.out.println("0) Listar ");
                    System.out.println("1) Salir ");
                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 0:
                            listarResources(recursos);
                            break;
                        case 1:
                            System.out.println("Saliendo ");
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                }
                break;
            case "profesor":

                break;
            case "bibliotecario":

                break;
            default:
                System.out.println("Tipo de usuario invalido ");
        }


    }
    
    //Método para crear recursos
    
    
    //Método para listar recursos
    public static void listarResources(ArrayList recursos) {
        System.out.println("Recursos en la blioteca: ");
        for (int i = 0; i < recursos.size(); i++) {
            System.out.println(i + recursos.get(i).toString());
        }
        System.out.println("Recursos listados ");
    }
}
