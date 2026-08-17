package br.edu.nexuslog.legacy;

import br.edu.nexuslog.legacy.enums.FreightType;
import br.edu.nexuslog.legacy.enums.Carrier;

public class LegacyShippingServiceCorrigido {

    // Separando as funções da função "process" original.

    // Cálculo do preço
    // Switch expression com o "->", sendo exigido que todos os valores do enum sejam tratados
    public double calcularPreco(FreightType freightType, double weightKg){
        //Estrutura switch case que altera o cálculo do frete dependendo do tipo do frete contratado
        return switch (freightType){
            case ECONOMICO ->  10.0 + weightKg * 1.5;
            case EXPRESSO -> 25.0 + weightKg * 3.0;
            case PRIORITARIO -> 40.0 + weightKg * 4.5;
        };
    }

    //Função para chamar a api necessária dependendo da transportadora selecionada
    public void chamarAPITransportadora(Carrier carrier){
        switch (carrier){
            case CORREIOS -> System.out.println("Chamando API Correios...");
            case RAPIDEX -> System.out.println("Chamando API Rapidex...");
        }
    }

    //Função para enviar email para o cliente
    public void enviarEmail(String customerName) {
        System.out.println("Enviando e-mail para " + customerName);
    }

    //Função para registrar a movimentação no log
    public void registrarLog(String customerName){
        System.out.println("Registrando log de envio para " + customerName);
    }

    // Método orquestrador, servindo para chamar na ordem cada função
    public double process(String customerName, FreightType freightType, double weightKg, Carrier carrier) {
        double price = calcularPreco(freightType, weightKg);

        chamarAPITransportadora(carrier);
        enviarEmail(customerName);
        registrarLog(customerName);

        return price;
    }
}
