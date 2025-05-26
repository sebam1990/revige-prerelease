package org.revige.client;

import org.revige.Main;
import org.revige.products.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class clientMenu {

    static ArrayList<Product> shoppingCart = new ArrayList();

    public clientMenu() {
    }

    public static void viewShoppingCart(){

        if(shoppingCart.isEmpty()){

            System.out.println("Tu carrito esta vacio");

        }
        else{

            for(Product selectedItem:shoppingCart){

                System.out.println(selectedItem.toString());

            }

        }

    }

    public static void run() {

        System.out.println("REVIGE");
        System.out.println("----------");
        System.out.println("Bienvenido al tu perfil");
        System.out.println("");
        System.out.println("Selecciona una opción del menu para continuar");

        System.out.println("1 - Ver catalogo de paquetes");
        System.out.println("2 - Ver carrito de compras");
        System.out.println("3 - Ver pedidos anteriores");
        System.out.println("4 - Menú principal");
        System.out.println("5 - Salir");

        Scanner menuOption = new Scanner(System.in);
        int option = menuOption.nextInt();

        switch (option) {

            case 1:
                System.out.println("Catalogo");
                break;
            case 2:
                viewShoppingCart();
                break;
            case 3:
                System.out.println("Pedidos/");
                break;
            case 4:
                Main.main(null);
                break;
            case 5:
                System.exit(0);
                break;


        }

    }

}
