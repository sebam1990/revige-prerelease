// Package

    package org.revige.admin;

// Imports

    import org.json.simple.JSONArray;
    import org.json.simple.parser.JSONParser;
    import org.json.simple.parser.ParseException;
    import org.revige.Main;
    import org.revige.products.Bike;
    import org.revige.products.Car;
    import org.revige.products.Product;
    import org.revige.products.Scooter;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Scanner;

// Class

public class adminMenu {

    static ArrayList<String> productsList = new ArrayList();

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

    static void addProduct(){

        System.out.println("--------------------");

        Scanner prop = new Scanner(System.in);

        System.out.println("¿Pará que tipo de vehículo es el paquete?");
        System.out.println("1) Auto/Camioneta - 2) Moto - 3) Bicicleta");
        int vehicleType = prop.nextInt();

        System.out.println("¿Cual es la descripción del paquete?");
        String description = prop.next();

        System.out.println("¿Cual es el precio básico de la hora?");
        double hourPrice = prop.nextDouble();

        System.out.println("¿Cuantas plazas hay disponibles para este paquete?");
        int stock = prop.nextInt();

        switch(vehicleType){
            case 1:
                Product newCar = new Car(description,hourPrice,stock);
                System.out.println("El nuevo paquete creado es:");
                String newCarStr = new String("[" + newCar.getDescription() + ", " + newCar.getHourPrice() + "]");
                productsList.add(newCarStr);
                run();
                break;
            case 2:
                Product newScotter = new Scooter(description,hourPrice,stock);
                System.out.println("El nuevo paquete creado es:");
                String newScotterStr = new String("[" + newScotter.getDescription() + ", " + newScotter.getHourPrice() + "]");
                productsList.add(newScotterStr);
                run();
            case 3:
                Product newBike = new Bike(description,hourPrice,stock);
                String newBikeStr = new String("[" + newBike.getDescription() + ", " + newBike.getHourPrice() + "]");
                productsList.add(newBikeStr);
                run();
            default:
                System.out.println("No seleccionaste un tipo de paquete disponible");
                addProduct();

        }

    };

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
                    addProduct();
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
