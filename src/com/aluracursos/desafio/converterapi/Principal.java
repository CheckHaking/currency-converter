package com.aluracursos.desafio.converterapi;

import records.Divisa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opc=0;
        Scanner input = new Scanner(System.in);
        ConsultaDivisas consulta = new ConsultaDivisas();

        System.out.println("");
        while(opc!=7){
            System.out.println("*****************************************");
            System.out.println("1) Dolar => Peso Argentino" +
                    "\n2) Peso Argentino => Dolar" +
                    "\n3) Dolar => Real Brasileño" +
                    "\n4) Real Brasileño => Dolar" +
                    "\n5) Dolar => Peso Mexicano" +
                    "\n6) Peso Mexicano => Dolar" +
                    "\n7) Salir");
            System.out.println("Ingrese una ocpion valida: ");
            System.out.println("*****************************************");
            opc = input.nextInt();
            switch (opc){
                case 1 -> {
                    Divisa divisa = consulta.consultaDivisas("USD", "ARS");
                    double valor = divisa.conversion_rate();
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cant = input.nextDouble();
                    double valorNuevo = valor * cant;
                    String valorRedondeado = String.format("%.2f", valorNuevo);
                    System.out.println("Dolares (" + cant + ") = " + valorRedondeado + " Pesos Argentinos");
                }
                case 2 -> {
                    // Lógica para Peso Argentino a Dólar
                    Divisa divisa = consulta.consultaDivisas("ARS", "USD");
                    double valor = divisa.conversion_rate();
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cant = input.nextDouble();
                    double valorNuevo = valor * cant;
                    String valorRedondeado = String.format("%.2f", valorNuevo);
                    System.out.println("Pesos Argentinos (" + cant + ") = " + valorRedondeado + " Dólares");
                }
                case 3 -> {
                    // Lógica para Dólar a Real Brasileño
                    Divisa divisa = consulta.consultaDivisas("USD", "BRL");
                    double valor = divisa.conversion_rate();
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cant = input.nextDouble();
                    double valorNuevo = valor * cant;
                    String valorRedondeado = String.format("%.2f", valorNuevo);
                    System.out.println("Dolares (" + cant + ") = " + valorRedondeado + " Reales Brasileños");
                }
                case 4 -> {
                    // Lógica para Real Brasileño a Dólar
                    Divisa divisa = consulta.consultaDivisas("BRL", "USD");
                    double valor = divisa.conversion_rate();
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cant = input.nextDouble();
                    double valorNuevo = valor * cant;
                    String valorRedondeado = String.format("%.2f", valorNuevo);
                    System.out.println("Reales Brasileños (" + cant + ") = " + valorRedondeado + " Dólares");
                }
                case 5 -> {
                    // Lógica para Dólar a Peso Mexicano
                    Divisa divisa = consulta.consultaDivisas("USD", "MXN");
                    double valor = divisa.conversion_rate();
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cant = input.nextDouble();
                    double valorNuevo = valor * cant;
                    String valorRedondeado = String.format("%.2f", valorNuevo);
                    System.out.println("Dolares (" + cant + ") = " + valorRedondeado + " Pesos Mexicanos");
                }
                case 6 -> {
                    // Lógica para Peso Mexicano a Dólar
                    Divisa divisa = consulta.consultaDivisas("MXN", "USD");
                    double valor = divisa.conversion_rate();
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cant = input.nextDouble();
                    double valorNuevo = valor * cant;
                    String valorRedondeado = String.format("%.2f", valorNuevo);
                    System.out.println("Pesos Mexicanos (" + cant + ") = " + valorRedondeado + " Dólares");
                }
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }


        }



    }



}
