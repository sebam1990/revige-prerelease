// Package

    package org.revige.admin;

// Class

import org.revige.Main;

import java.util.Scanner;

public class adminMenu {

    public adminMenu() {
    }

    public static void run(){

            System.out.println("REVIGE");
            System.out.println("----------");
            System.out.println("Bienvenido al panel de administrador");
            System.out.println("");
            System.out.println("Selecciona una opción del menu para continuar");

            System.out.println("1 - Ver catalogo de paquetes");
            System.out.println("2 - Agregar paquete");
            System.out.println("3 - Modificar paquete");
            System.out.println("4 - Eliminar paquete");
            System.out.println("5 - Menú principal");
            System.out.println("6 - Salir");

            Scanner menuOption = new Scanner(System.in);
            int option = menuOption.nextInt();

            switch(option){

                case 1:
                    System.out.println("Catalogo");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    Main.main(null);
                    break;
                case 6:
                    System.exit(0);
                    break;

            }

        }

    }
