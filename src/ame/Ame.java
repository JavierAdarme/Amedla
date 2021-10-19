/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Camilo
 */
public class Ame {

    //Atributos
    private static ArrayList<usuario> usuarios = new ArrayList<usuario>();//
    private static ArrayList<rotacion> rotaciones = new ArrayList<rotacion>();
    private static ArrayList<potrero> potreros = new ArrayList<potrero>();
    private static ArrayList<animal> animales = new ArrayList<animal>();
    private static ArrayList<aforo> aforos = new ArrayList<aforo>();
    //Atributos Usuario
    private static String nombre, apellido, contrasena, tipoUsuario;//
    //
    //Atributos Rotación
    private static String nombreR;
    private static int numeroPotreros;
    private static double tamanoRotacion;
    //
    //Atributos Potrero
    private static String nombrepo;
    private static double tamano;
    //
    //Atributos Animal
    private static String identificacion, madre, estado, genero;
    private static int mes, ano, dia;
    private static char agenero;
    //
    //Atributos Aforo 
    private static String tipoAforo, nombrePotrero;
    private static double tamanoPotrero, hojaAncha, hojaAngosta, otro, descubierto, bajo, medio, alto;
    private static int numeroMuestras, diasUso, diasLibre;
    //
    //Atributos propios de esta clase
    private static Scanner input = new Scanner(System.in);
    private static int opt, deci, index, aceptar;
    private static boolean vacio;

    public static void main(String[] args) {
        try {
            menu();
            System.out.println("");
            System.out.println("Has salido del menu");

        } catch (Exception E) {
            System.out.print("Se ha presentado el error: " + E);
        }
    }

    public static void menu() {
        System.out.println("Este es el menú del sistema. Por favor elija una opción");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Registrar rotación");
        System.out.println("3. Registrar potrero");
        System.out.println("4. Registrar animal");
        System.out.println("5. Iniciar aforo de potrero");
        System.out.println("6. Limpiar consola");
        System.out.println("0. Salir");

        opt = input.nextInt();

        if (opt == 1) {
            registroU();
        }
        if (opt == 2) {
            registroRota();
        }
        if (opt == 3) {
            registroPotre();
        }
        if (opt == 4) {
            registroAni();
        }
        if (opt == 5) {
            aforar();
        }
        if (opt == 6) {
            System.out.print('\u000C');
            menu();
        }
        if (opt == 0) {
            return;
        }
    }

    //Registro de usuarios
    public static void registroU() {
        nombre = input.nextLine();
        System.out.println("                      Registro de usuarios               ");
        System.out.println("Ingrese el nombre del usuario");
        nombre = input.nextLine();
        System.out.println("Ingrese el apellido del usuario");
        apellido = input.nextLine();
        System.out.println("Ingrese la contraseña del usuario");
        contrasena = input.nextLine();
        System.out.println("Ingrese el tipo de usuario del usuario (Jefe o empleado) ");
        tipoUsuario = input.nextLine();
        usuarios.add(new usuario(nombre, apellido, contrasena, tipoUsuario));
        System.out.println("El usuario: " + usuarios.get(usuarios.size() - 1).getNombre() + " fué añadido");
        nombre = input.nextLine();
        System.out.println("");
        System.out.println("");
        menu();
    }

    //Registro de rotaciones
    public static void registroRota() {
        input.nextLine();
        System.out.println("                      Registro de rotaciones               ");
        System.out.println("Ingrese el nombre de la rotación");
        nombreR = input.nextLine();
        System.out.println("Ingrese el tamaño de la rotación");
        tamanoRotacion = input.nextDouble();
        System.out.println("Ingrese el número de potreros en la rotación");
        numeroPotreros = input.nextInt();
        rotaciones.add(new rotacion(nombreR, numeroPotreros, tamanoRotacion));
        System.out.println("La rotación: " + rotaciones.get(rotaciones.size() - 1).getNombre() + " fué añadida");
        input.nextLine();
        System.out.println("");
        System.out.println("");
        menu();
    }

    //Registro de potreros
    public static void registroPotre() {
        input.nextLine();
        System.out.println("                      Registro de potreros               ");
        System.out.println("Ingrese el nombre del potrero");
        nombrepo = input.nextLine();
        System.out.println("Ingrese el tamaño del potrero");
        tamano = input.nextDouble();
        potreros.add(new potrero(nombrepo, tamano));
        System.out.println("El potrero: " + potreros.get(potreros.size() - 1).getNombrepo() + " fué añadido");
        input.nextLine();
        System.out.println("");
        System.out.println("");
        menu();
    }

    //Registro de animales
    public static void registroAni() {
        input.nextLine();
        System.out.println("                      Registro de animales               ");
        System.out.println("Ingrese la identificación del animal");
        identificacion = input.nextLine();
        System.out.println("Ingrese el estado del animal (puede ser ok, enfermo, preñada, etc)");
        estado = input.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del animal. Primero mes, luego año, luego día");
        System.out.println("Primero el día");
        dia = input.nextInt();
        System.out.println("Ahora el mes");
        mes = input.nextInt();
        System.out.println("Ahora el año");
        ano = input.nextInt();
        System.out.println("Ingrese el género del animal (F/M)");
        genero = input.nextLine();

        vacio = animales.isEmpty();
        input.nextLine();

        do {
            System.out.println("Ingrese la identificación de la madre del animal. Si el animal fue comprado, por favor escriba 'compra'");
            madre = input.nextLine();
            deterMadre(madre);
        } while (aceptar == 0);
        aceptar = 0;
        vacio = animales.isEmpty();
        if (vacio == false) {
            System.out.println("El animal: " + animales.get(animales.size() - 1).getIdentificacion() + " fué añadido");
        }

        input.nextLine();
        System.out.println("");
        System.out.println("");

        menu();

        //String identificacion, String madre, String estado, int mes, int ano, int dia, char genero
    }

    //Determinar si la madre del animal existe o no
    public static void deterMadre(String madre) {
        if (vacio == true) {
            System.out.println("Este es el primer animal de su lista");
            animales.add(new animal(identificacion, madre, estado, mes, ano, dia, genero));
            aceptar = 1;
        } else if (madre.equals("compra")) {
            System.out.println("Es un animal comprado, desconocemos a su madre y lo añadimos a la lista");
            animales.add(new animal(identificacion, madre, estado, mes, ano, dia, genero));
            index = animales.size();
            aceptar = 1;
        } else {
            index = animales.size();
            System.out.println("No es un animal comprado, tiene madre. Buscaré si la madre existe");
            for (int i = 0; i <= index; i++) {
                if (madre.equals(animales.get(i).getIdentificacion())) {
                    System.out.println("La madre existe");
                    System.out.println(animales.get(i).getIdentificacion());
                    animales.add(new animal(identificacion, madre, estado, mes, ano, dia, genero));
                    aceptar = 1;
                    return;
                } else if (index - 1 == i) {
                    System.out.println("El animal madre, identificado como '" + madre + "', no presenta registro alguno. Por favor, vuelva a intentar");
                    aceptar = 0;
                    return;
                }
            }
            System.out.println("El valor de aceptar es: " + aceptar);
        }
    }

    //Registro de aforos
    public static void aforar() {
        input.nextLine();
        System.out.println("                      Registro de aforos               ");
        System.out.println("¿Es un aforo de entrada o de salida?");
        tipoAforo = input.nextLine();
        aceptar = 0;
        System.out.println("Ingrese el nombre del potrero en que hará el aforo");
        nombrePotrero = input.nextLine();
        System.out.println("");

        do {
            System.out.println("Buscaré si el potrero existe");
            deterPotrero(nombrePotrero);
            if (aceptar == 2) {
                menu();
            }
        } while (aceptar == 0);

        tamanoPotrero = potreros.get(index).getTamano();
        System.out.println("¿Cuantas muestras por nivel de crecimiento tomará?");
        numeroMuestras = input.nextInt();
        input.nextLine();
        System.out.println("¿Durante cuantos dias ha estado libre el potrero?");
        diasLibre = input.nextInt();
        input.nextLine();
        System.out.println("¿Durante cuantos dias espera que los animales se alimenten del potrero?");
        diasUso = input.nextInt();
        input.nextLine();

        vacio = potreros.isEmpty();
        if (vacio == false) {
            aforos.add(new aforo(tipoAforo, nombrePotrero, tamanoPotrero, numeroMuestras, diasUso, diasLibre));
            System.out.println("El registro de aforo fue añadido");
        } else {
            System.out.println("No es posible registrar un aforo sobre un potrero que no existe");
            return;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Empezaremos por calcular las hectáreas libres en el potrero");
        System.out.println("");
        System.out.println("Por favor, digite la siguiente información según su evaluación");
        //Ha libres
        System.out.println("Porcentaje de maleza hoja ancha");
        hojaAncha = input.nextDouble();

        System.out.println("Porcentaje de maleza hoja angosta");
        hojaAngosta = input.nextDouble();
        input.nextLine();

        System.out.println("Porcentaje de otro tipo de malezas");
        otro = input.nextDouble();
        input.nextLine();

        System.out.println("Porcentaje de otro suelo descubierto");
        descubierto = input.nextDouble();
        input.nextLine();

        aforos.get(index).calculoHectaLibres(hojaAncha, hojaAngosta, otro, descubierto);
        System.out.println("El potrero cuenta con: " + aforos.get(index).getHaLibres() + " Ha libres");
        //
        //Lista pasto bajo        
        System.out.println("");
        System.out.println("Ahora ingresará los pesos de cada muestra en gr");
        System.out.println("Por favor, digite los pesos encontrados para el pasto de nivel bajo");
        input.nextLine();
        aforos.get(index).setDatosBajo();
        //       
        //Lista pasto medio        
        System.out.println("");
        System.out.println("Por favor, digite los pesos encontrados para el pasto de nivel medio");
        input.nextLine();
        aforos.get(index).setDatosMedio();
        //    
        //Lista pasto alto        
        System.out.println("");
        System.out.println("Por favor, digite los pesos encontrados para el pasto de nivel alto");
        input.nextLine();
        aforos.get(index).setDatosAlto();
        //    
        //Calcular promedios
        aforos.get(index).calcularPromedioBajo();
        aforos.get(index).calcularPromedioMedio();
        aforos.get(index).calcularPromedioAlto();
        //
        //
        input.nextLine();
        System.out.println("");
        System.out.println("Ahora, tendrá que indicar la representación, en porcentaje, por nivel de crecimiento de cada nivel de pasto");
        System.out.println("");
        //
        //Representaciones
        System.out.println("Por favor, digite la representación para el pasto de nivel bajo");
        bajo = input.nextDouble();
        input.nextLine();

        System.out.println("Por favor, digite la representación para el pasto de nivel medio");
        medio = input.nextDouble();
        input.nextLine();

        System.out.println("Por favor, digite la representación para el pasto de nivel alto");
        alto = input.nextDouble();
        input.nextLine();
        aforos.get(index).setRepresentaciones(bajo, medio, alto);
        aforos.get(index).haNiveles();
        //
        //
        System.out.println("");
        System.out.println("Eso significa que el potrero posee:");
        System.out.println(aforos.get(index).getHaCreciBajo() + " Hectáreas de pasto bajo");
        System.out.println(aforos.get(index).getHaCreciMedio() + " Hectáreas de pasto medio");
        System.out.println(aforos.get(index).getHaCreciAlto() + " Hectáreas de pasto alto");
        System.out.println("");
        System.out.println("");
        //
        //Promedios ponderados
        aforos.get(index).promPondeBajo();
        aforos.get(index).promPondeMedio();
        aforos.get(index).promPondeAlto();
        aforos.get(index).promPondeAforo();
        aforos.get(index).calcularKgForraje();
        aforos.get(index).calcularProduTotal();
        aforos.get(index).calcularProduDiaria();
        aforos.get(index).calcularDispoTotal();
        aforos.get(index).calcularUgg();
        aforos.get(index).calcularUgm();

        System.out.println("");
        System.out.println("Durante los " + diasUso + " días que piensa usar el potrero, podrá alimentar a un total de:");
        System.out.println((int) aforos.get(index).getUgg() + " animales de 450 kg");
        System.out.println("y");
        System.out.println((int) aforos.get(index).getUgm() + " animales de 500 kg");
        System.out.println("");
        input.nextLine();
        menu();
        //diasLibre 
    }

    //Determinar si potrero existe
    public static void deterPotrero(String nombrePotrero) {
        vacio = potreros.isEmpty();
        if (vacio == true) {
            System.out.println("No existe el registro de ningún potrero. Por favor, cree uno primero");
            aceptar = 0;
            menu();
        } else {
            index = potreros.size();
            for (int i = 0; i <= index; i++) {
                if (nombrePotrero.equals(potreros.get(i).getNombrepo())) {
                    System.out.println("He encontrado al potrero");
                    System.out.println("");
                    aceptar = 1;
                    index = i;
                    break;
                } else if (index - 1 == i) {
                    System.out.println("El potrero '" + nombrePotrero + "' no existe. Verifique el nombre nuevamente");
                    aceptar = 2;
                    break;
                }
            }
        }
    }

}
