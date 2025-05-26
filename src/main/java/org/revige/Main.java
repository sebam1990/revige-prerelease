// Package

    package org.revige;

// Imports


    import org.revige.admin.adminMenu;
    import org.revige.client.clientMenu;

    import java.io.IOException;
    import java.util.Scanner;

// Class

    public class Main {

        // Main menu method

            static void getOption(){

                Scanner optionReader = new Scanner(System.in);
                System.out.println(">> "); int menuOption = optionReader.nextInt();

                switch(menuOption){
                    case 1:
                        adminMenu admin = new adminMenu();
                        admin.run();
                        break;
                    case 2:
                        clientMenu client = new clientMenu();
                        client.run();
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("El tipo de usuario seleccionado no es correcto. Intenta con otra.");
                        getOption();
                }

            }

        // Main method

            public static void main(String[] args){

                System.out.println("REVIGE");
                System.out.println("Red Virtual de Garages y Estacionamientos");
                System.out.println("-----------------------------------------");
                System.out.println("");

                System.out.println("Selecciona una opción del menu para continuar");
                System.out.println("1 - Ingresar como administrador");
                System.out.println("2 - Ingresar como cliente");
                System.out.println("3 - Salir");

                getOption();

            }

        }