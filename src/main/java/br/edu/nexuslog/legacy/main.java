package br.edu.nexuslog.legacy;

import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.legacy.carrier.CorreiosCarrier;
import br.edu.nexuslog.legacy.freight.EconomicFreight;
import br.edu.nexuslog.legacy.freight.ExpressFreight;
import br.edu.nexuslog.legacy.interfaces.Carrier;
import br.edu.nexuslog.legacy.interfaces.Freight;
import br.edu.nexuslog.legacy.service.NotificationService;

public class main {
    public static void main(String[] args) {
        Shipment shipment = new Shipment("1L", "Samuel", 15.5);
        Freight freight = new ExpressFreight();
        Carrier carrier = new CorreiosCarrier();
        NotificationService notificationService = new NotificationService();

        System.out.println("Valor do frete: " + freight.freightCalculator(shipment));
        carrier.callApi();
        notificationService.email(shipment);
    }
}
