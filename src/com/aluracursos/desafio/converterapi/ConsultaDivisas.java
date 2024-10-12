package com.aluracursos.desafio.converterapi;

import com.google.gson.Gson;
import records.Divisa;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaDivisas {

    private static final Gson gson = new Gson();

    public Divisa consultaDivisas(String code, String code2){

        URI adress = URI.create("https://v6.exchangerate-api.com/v6/6342eed708f1feac3e089d35/pair/"+code+"/"+code2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .build();

        try{

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println("Respuesta API: " + response.body());

            Divisa divisa = gson.fromJson(response.body(), Divisa.class);

            return divisa;

        }
        catch (Exception e) {
            throw new RuntimeException("ALGO SALIO MAL"+e);
        }

    }
}
