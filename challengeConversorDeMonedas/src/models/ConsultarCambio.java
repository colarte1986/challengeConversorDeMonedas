package models;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultarCambio {

    public PairConversion buscaCambio(String moneda1, String moneda2) {

        PairConversion pairConversion = new PairConversion();

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/83cd54abed9ea3bd3cdebfa5/pair/"
                + moneda1 + "/"
                + moneda2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), PairConversion.class);

        } catch (Exception e) {
            throw new RuntimeException("No pude realizar la conversion.");
        }
    }

}
