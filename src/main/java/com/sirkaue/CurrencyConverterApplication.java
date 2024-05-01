package com.sirkaue;

import com.sirkaue.dto.CurrencyConverterDto;
import com.sirkaue.service.ApiService;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterApplication {
    public static void main(String[] args) {
        // Configurando o Scanner para usar o ponto como separador decimal
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        ApiService apiService = new ApiService();

        System.out.println("Seja bem vindo ao conversor de moedas! ");
        System.out.println("Escolha uma opção para fazer a conversão: ");
        System.out.println("1) Real (BRL) -> Dólar (USD)");
        System.out.println("2) Real (BRL) -> Euro (EUR)");
        System.out.println("3) Real (BRL) -> Libra esterlina (GBP)");
        System.out.println("4) Libra esterlina (GBP) -> Dólar (USD)");
        System.out.println("5) Libra esterlina (GBP) -> Euro (EUR)");
        System.out.println("6) Dólar (USD) -> Euro (EUR)");
        System.out.println("Digite 0 para sair");

        int opcao = sc.nextInt();
        try {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para a conversão: ");
                    double brlToUsdValor = sc.nextDouble();
                    if (brlToUsdValor < 0) {
                        System.out.println("Valor inválido! O valor não pode ser negativo.");
                        return;
                    }
                    CurrencyConverterDto brlToUsd = apiService.getCurrency("BRL", "USD", brlToUsdValor);
                    System.out.println("Conversão de BRL para USD: " + brlToUsd.getConversionResult());
                    break;
                case 2:
                    System.out.println("Digite o valor para a conversão: ");
                    double brlToEurValor = sc.nextDouble();
                    if (brlToEurValor < 0) {
                        System.out.println("Valor inválido! O valor não pode ser negativo.");
                        return;
                    }
                    CurrencyConverterDto brlToEur = apiService.getCurrency("BRL", "EUR", brlToEurValor);
                    System.out.println("Conversão de BRL para EUR: " + brlToEur.getConversionResult());
                    break;
                case 3:
                    System.out.println("Digite o valor para a conversão: ");
                    double brlToGbpValor = sc.nextDouble();
                    if (brlToGbpValor < 0) {
                        System.out.println("Valor inválido! O valor não pode ser negativo.");
                        return;
                    }
                    CurrencyConverterDto brlToGbp = apiService.getCurrency("BRL", "GBP", brlToGbpValor);
                    System.out.println("Conversão de BRL para GBP: " + brlToGbp.getConversionResult());
                    break;
                case 4:
                    System.out.println("Digite o valor para a conversão: ");
                    double gbpToUsdValor = sc.nextDouble();
                    if (gbpToUsdValor < 0) {
                        System.out.println("Valor inválido! O valor não pode ser negativo.");
                        return;
                    }
                    CurrencyConverterDto gbpToUsd = apiService.getCurrency("GBP", "USD", gbpToUsdValor);
                    System.out.println("Conversão de GBP para USD: " + gbpToUsd.getConversionResult());
                    break;
                case 5:
                    System.out.println("Digite o valor para a conversão: ");
                    double gbpToEurValor = sc.nextDouble();
                    if (gbpToEurValor < 0) {
                        System.out.println("Valor inválido! O valor não pode ser negativo.");
                        return;
                    }
                    CurrencyConverterDto gbpToEur = apiService.getCurrency("GBP", "EUR", gbpToEurValor);
                    System.out.println("Conversão de GBP para EUR: " + gbpToEur.getConversionResult());
                    break;
                case 6:
                    System.out.println("Digite o valor para a conversão: ");
                    double usdToEurValor = sc.nextDouble();
                    if (usdToEurValor < 0) {
                        System.out.println("Valor inválido! O valor não pode ser negativo.");
                        return;
                    }
                    CurrencyConverterDto usdToEur = apiService.getCurrency("USD", "EUR", usdToEurValor);
                    System.out.println("Conversão de USD para EUR: " + usdToEur.getConversionResult());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
