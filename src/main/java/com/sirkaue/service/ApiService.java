package com.sirkaue.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sirkaue.dto.CurrencyConverterDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    CurrencyConverterDto currencyConverterDto = new CurrencyConverterDto();

    public CurrencyConverterDto getCurrency(String baseCode, String targetCode, Double amount) {
        try {
            URI url = URI.create("https://v6.exchangerate-api.com/v6/b6483ce178bcd3db441c3361/pair/");

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(url + baseCode + "/" + targetCode + "/" + amount))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            currencyConverterDto = mapper.readValue(response.body(), CurrencyConverterDto.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return currencyConverterDto;
    }
}
