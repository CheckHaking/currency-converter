package com.aluracursos.desafio.converterapi;

import com.google.gson.Gson;
import records.Divisa;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisas {
    public Divisa consultaDivisas(String code){

        URI adress = URI.create("https://v6.exchangerate-api.com/v6/6342eed708f1feac3e089d35/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .build();

        try{

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Divisa.class);

        }
        catch (Exception e) {
            throw new RuntimeException("ALGO SALIO MAL"+e);
        }

    }
}
