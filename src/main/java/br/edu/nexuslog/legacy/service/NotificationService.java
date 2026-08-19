package br.edu.nexuslog.legacy.service;

import br.edu.nexuslog.domain.Shipment;

public class NotificationService {
    public void email(Shipment shipment){
        System.out.println("Enviando e-mail para " + shipment.customerName());
        System.out.println("Registrando log de envio para " + shipment.customerName());
    }

}
