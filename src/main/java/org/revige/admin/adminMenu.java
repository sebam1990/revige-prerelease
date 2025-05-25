// Package

    package org.revige.admin;

// Class
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.revige.Main;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class adminMenu {

    public adminMenu() {
    }

    static void getCatalog(){

       JSONParser parser = new JSONParser();

       try(

           FileReader file = new FileReader("src/main/resources/data.json")){

           Object obj = parser.parse(file);

           JSONArray productsArray = (JSONArray) obj;

           for(Object producto:productsArray){

               System.out.println(producto);

           }

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (ParseException e) {
           throw new RuntimeException(e);
       }


    }

    public static void run() {

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
                    getCatalog();
                    break;
                case 2:
                    //System.out.println("2");
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
