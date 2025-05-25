// Package

    package org.revige;

// Imports


    import org.revige.admin.adminMenu;

    import java.io.IOException;
    import java.util.Scanner;

// Class

    public class Main {

        // Main menu method

            static void getOption(){

                Scanner optionReader = new Scanner(System.in);
                System.out.println(">> "); int menuOption = optionReader.nextInt();

                if(menuOption == 1){

                    //System.out.println("Ingresaste como usuario administrador");
                    adminMenu admin = new adminMenu();
                    admin.run();

                }

                else if(menuOption == 2){

                    System.out.println("Ingresaste como usuario cliente");

                }

                else if(menuOption == 3){

                    System.exit(0);

                }

                else{

                    System.out.println("La opción ingresada no es correcta. Volve a intentar.");
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