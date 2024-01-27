/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_sheyllacortez;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
    static ArrayList<Usuario> usuarito = new ArrayList<>();
    static ArrayList recursos = new ArrayList();

    public static void main(String[] args) {
        //Estudiante
        Usuario estudiante = new Usuario("josue2", "123", "estudiante");
        usuarito.add(estudiante);
        //Profesor
        Usuario profesor = new Usuario("mrmanuel", "456", "profesor");
        usuarito.add(profesor);
        //Bliotecario
        Usuario bibliotecario = new Usuario("biblioaxel", "678", "bibliotecario");
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
        Libro mybook = new Libro("principito", "JK", "literatura", "09/11/2023", "si");
        recursos.add(mybook);
        Articulos myArticle = new Articulos("Science", "Gabriel Marquez", "particles", "11/09/2012", "si");
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
                int op = 0;
                while (op != 2) {
                    System.out.println("Que desea hacer: ");
                    System.out.println("0) Listar ");
                    System.out.println("1) Crear ");
                    System.out.println("2) Salir ");
                    op = entrada.nextInt();
                    switch (op) {
                        case 0:
                            listarResources(recursos);
                            break;
                        case 1:
                            int option = 0;
                            while (option != 5) {
                                System.out.println("Que tipo de recurso desea crear: ");
                                System.out.println("1. Libro ");
                                System.out.println("2. Articulo ");
                                System.out.println("3. Cursos en linea ");
                                System.out.println("4. Conferencias ");
                                System.out.println("5. Salir");
                                option = entrada.nextInt();
                                switch (option) {
                                    case 1:
                                        agregarLibro(recursos);
                                        break;
                                    case 2:
                                        agregarArticulo(recursos);
                                        break;
                                    case 3:
                                        agregarCurso(recursos);
                                        break;
                                    case 4:
                                        agregarConferencia(recursos);
                                        break;
                                    case 5:
                                        System.out.println("Saliendo ");
                                        break;
                                    default:
                                        System.out.println("Opcion Invalida ");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Saliendo ");
                            break;
                        default:
                            System.out.println("Opcion invalida ");
                    }
                }
                break;
            case "bibliotecario":
                int myop = 0;
                while (myop != 4) {
                    System.out.println("Que desea hacer: ");
                    System.out.println("0) Listar ");
                    System.out.println("1) Crear ");
                    System.out.println("2) Eliminar ");
                    System.out.println("3) Modificar ");
                    System.out.println("4) Salir");
                    myop = entrada.nextInt();
                    switch (myop) {
                        case 0:
                            listarResources(recursos);
                            break;
                        case 1:
                            int option = 0;
                            while (option != 5) {
                                System.out.println("Que tipo de recurso desea crear: ");
                                System.out.println("1. Libro ");
                                System.out.println("2. Articulo ");
                                System.out.println("3. Cursos en linea ");
                                System.out.println("4. Conferencias ");
                                System.out.println("5. Salir");
                                option = entrada.nextInt();
                                switch (option) {
                                    case 1:
                                        agregarLibro(recursos);
                                        break;
                                    case 2:
                                        agregarArticulo(recursos);
                                        break;
                                    case 3:
                                        agregarCurso(recursos);
                                        break;
                                    case 4:
                                        agregarConferencia(recursos);
                                        break;
                                    case 5:
                                        System.out.println("Saliendo ");
                                        break;
                                    default:
                                        System.out.println("Opcion Invalida ");
                                }
                            }
                            break;
                        case 2:
                            eliminateResources(recursos);
                            break;
                        case 3:
                            int opc = 0;
                            while (opc != 5) {
                                System.out.println("Que tipo de recurso desea modificar: ");
                                System.out.println("1. Libro ");
                                System.out.println("2. Articulo ");
                                System.out.println("3. Cursos en linea ");
                                System.out.println("4. Conferencias ");
                                System.out.println("5. Salir");
                                opc = entrada.nextInt();
                                switch (opc) {
                                    case 1:
                                        modiLibro(recursos);
                                        break;
                                    case 2:
                                        modiRecursos(recursos, opc);
                                        break;
                                    case 3:
                                        modiRecursos(recursos, opc);
                                        break;
                                    case 4:
                                        modiRecursos(recursos, opc);
                                        break;
                                    case 5:
                                        System.out.println("Saliendo ");
                                        break;
                                    default:
                                        System.out.println("Opcion invalida ");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Saliendo ");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                }
                break;
            default:
                System.out.println("Tipo de usuario invalido ");
        }

    }

    //Método para crear libro
    public static void agregarLibro(ArrayList recursos) {
        System.out.println("Crear recursos");

        System.out.println("Ingrese titulo: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        System.out.println("Ingrese autor: ");
        String autor = entrada.nextLine();
        System.out.println("Ingrese genero: ");
        String genero = entrada.nextLine();
        System.out.println("Ingrese ano de publicacion: ");
        String anoPublic = entrada.nextLine();
        System.out.println("Ingrese disponibilidad: ");
        String disponibilidad = entrada.nextLine();

        Libro mybook = new Libro(titulo, autor, genero, anoPublic, disponibilidad);
        recursos.add(mybook);

    }

    //Método para crear articulo
    public static void agregarArticulo(ArrayList recursos) {
        System.out.println("Crear recursos");

        System.out.println("Ingrese titulo: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        System.out.println("Ingrese autor: ");
        String autor = entrada.nextLine();
        System.out.println("Ingrese tema: ");
        String tema = entrada.nextLine();
        System.out.println("Ingrese fecha de publicacion: ");
        String fechaPublic = entrada.nextLine();
        System.out.println("Ingrese acceso en linea: ");
        String onlineAccess = entrada.nextLine();

        Articulos myarticle = new Articulos(titulo, autor, tema, fechaPublic, onlineAccess);
        recursos.add(myarticle);
    }

    //Método para crear cursos en linea
    public static void agregarCurso(ArrayList recursos) {
        System.out.println("Crear recursos");

        System.out.println("Ingrese titulo: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        System.out.println("Ingrese instructor: ");
        String instructor = entrada.nextLine();
        System.out.println("Ingrese duracion en semanas: ");
        int duraWeek = entrada.nextInt();
        System.out.println("Ingrese plataforma: ");
        entrada.nextLine();
        String platForm = entrada.nextLine();

        CursosOnline mycurso = new CursosOnline(titulo, instructor, duraWeek, platForm);
        recursos.add(mycurso);
    }

    //Método para crear conferencia
    public static void agregarConferencia(ArrayList recursos) {
        System.out.println("Crear recursos");

        System.out.println("Ingrese titulo: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        System.out.println("Ingrese conferencista: ");
        String conferencista = entrada.nextLine();
        System.out.println("Ingrese fecha: ");
        String fecha = entrada.nextLine();
        System.out.println("Ingrese duracion: ");
        int duracion = entrada.nextInt();
        System.out.println("Ingrese enlace de acceso: ");
        entrada.nextLine();
        String linkAccess = entrada.nextLine();

        Conferencias confe = new Conferencias(titulo, conferencista, fecha, duracion, linkAccess);
        recursos.add(confe);
    }

    //Método para listar recursos
    public static void listarResources(ArrayList recursos) {
        System.out.println("Recursos en la blioteca: ");
        for (int i = 0; i < recursos.size(); i++) {
            System.out.println(i + recursos.get(i).toString());
        }
        System.out.println("Recursos listados ");
    }

    //Método para modificar recursos
    public static void modiLibro(ArrayList recursos) {
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i) instanceof Libro) {
                Libro nuevolibro = (Libro) recursos.get(i);
                int choose = 0;
                System.out.println("Que desea modificar: ");
                System.out.println("1. Titulo ");
                System.out.println("2. autor ");
                System.out.println("3. genero ");
                System.out.println("4. ano de publicacion ");
                System.out.println("5. disponibilidad ");
                System.out.println("6. No modificar nada ");
                choose = entrada.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Ingrese el nuevo titulo: ");
                        entrada.nextLine();
                        String titulo = entrada.nextLine();
                        nuevolibro.setTitulo(titulo);
                        recursos.remove(i);
                        recursos.add(i, nuevolibro);
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo autor: ");
                        entrada.nextLine();
                        String autor = entrada.nextLine();
                        nuevolibro.setAutor(autor);
                        recursos.remove(i);
                        recursos.add(i, nuevolibro);
                        break;
                    case 3:
                        System.out.println("Ingrese el nuevo genero: ");
                        entrada.nextLine();
                        String genero = entrada.nextLine();
                        nuevolibro.setGenero(genero);
                        recursos.remove(i);
                        recursos.add(i, nuevolibro);
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo ano de publicacio: ");
                        entrada.nextLine();
                        String anoPublic = entrada.nextLine();
                        nuevolibro.setAnoPublic(anoPublic);
                        recursos.remove(i);
                        recursos.add(i, nuevolibro);
                        break;
                    case 5:
                        System.out.println("Ingrese la nueva disponibilidad: ");
                        entrada.nextLine();
                        String disponibilidad = entrada.nextLine();
                        nuevolibro.setDisponible(disponibilidad);
                        recursos.remove(i);
                        recursos.add(i, nuevolibro);
                        break;
                    case 6:
                        System.out.println("Saliendo ");
                        break;
                    default:
                        System.out.println("Opcion invalida ");
                }
            }
        }
    }

    //Método de eliminar recurso
    public static void eliminateResources(ArrayList recursos) {
        System.out.println("Ingrese el titulo a eliminar: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i) instanceof Libro) {
                Libro eliminar = (Libro) recursos.get(i);
                if (eliminar.getTitulo().equals(titulo)) {
                    recursos.remove(i);
                }
            } else if (recursos.get(i) instanceof Articulos){
                Articulos eliminar = (Articulos) recursos.get(i);
                if (eliminar.getTitulo().equals(titulo)) {
                    recursos.remove(i);
                }
            } else if (recursos.get(i) instanceof CursosOnline) {
                CursosOnline eliminar = (CursosOnline) recursos.get(i);
                if (eliminar.getTitulo().equals(titulo)) {
                    recursos.remove(i);
                }
            } else if (recursos.get(i) instanceof Conferencias) {
                Conferencias eliminar = (Conferencias) recursos.get(i);
                if (eliminar.getTitulo().equals(titulo)) {
                    recursos.remove(i);
                }
            } else {
                System.out.println("Invalido ");
            }
        }

    }


    
    
    
    

    //Método para modificar recursos siguientes
    public static void modiRecursos(ArrayList recursos, int opc) {
        for (int i = 0; i < recursos.size(); i++) {
            if (opc == 2) {
                if (recursos.get(i) instanceof Articulos) {
                    Articulos nuevoArticulo = (Articulos) recursos.get(i);
                    //Pedirle al usuario
                    System.out.println("Ingrese titulo: ");
                    entrada.nextLine();
                    String titulo = entrada.nextLine();
                    System.out.println("Ingrese autor: ");
                    String autor = entrada.nextLine();
                    System.out.println("Ingrese tema: ");
                    String tema = entrada.nextLine();
                    System.out.println("Ingrese fecha de publicacion: ");
                    String fechaPublic = entrada.nextLine();
                    System.out.println("Ingrese acceso en linea: ");
                    String onlineAccess = entrada.nextLine();

                    Articulos arti = new Articulos(titulo, autor, tema, fechaPublic, onlineAccess);
                    recursos.remove(i);
                    recursos.add(i, arti);
                }
            } else if (opc == 3) {
                if (recursos.get(i) instanceof CursosOnline) {
                    CursosOnline nuevosCursos = (CursosOnline) recursos.get(i);
                    //Nuevo
                    System.out.println("Ingrese titulo: ");
                    entrada.nextLine();
                    String titulo = entrada.nextLine();
                    System.out.println("Ingrese instructor: ");
                    String instructor = entrada.nextLine();
                    System.out.println("Ingrese duracion en semanas: ");
                    int duraWeek = entrada.nextInt();
                    System.out.println("Ingrese plataforma: ");
                    entrada.nextLine();
                    String platForm = entrada.nextLine();

                    CursosOnline mycurso = new CursosOnline(titulo, instructor, duraWeek, platForm);
                    recursos.remove(i);
                    recursos.add(i, mycurso);
                }
            } else if (opc == 4) {
                if (recursos.get(i) instanceof Conferencias) {
                    Conferencias nuevaConference = (Conferencias) recursos.get(i);
                    //Agg
                    System.out.println("Ingrese titulo: ");
                    entrada.nextLine();
                    String titulo = entrada.nextLine();
                    System.out.println("Ingrese conferencista: ");
                    String conferencista = entrada.nextLine();
                    System.out.println("Ingrese fecha: ");
                    String fecha = entrada.nextLine();
                    System.out.println("Ingrese duracion: ");
                    int duracion = entrada.nextInt();
                    System.out.println("Ingrese enlace de acceso: ");
                    entrada.nextLine();
                    String linkAccess = entrada.nextLine();

                    Conferencias confe = new Conferencias(titulo, conferencista, fecha, duracion, linkAccess);
                    recursos.remove(i);
                    recursos.add(i, confe);
                }
            } else {
                System.out.println("Opcion invalida");
            }
        }

    }
}
