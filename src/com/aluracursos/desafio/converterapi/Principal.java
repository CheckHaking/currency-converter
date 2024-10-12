package com.aluracursos.desafio.converterapi;

import records.Divisa;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Nuevo print");

        ConsultaDivisas consulta = new ConsultaDivisas();
        Divisa divisa = consulta.consultaDivisas("USD");
        System.out.println(divisa);

    }



}
