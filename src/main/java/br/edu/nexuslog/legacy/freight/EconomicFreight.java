package br.edu.nexuslog.legacy.freight;

import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.legacy.interfaces.Freight;

public class EconomicFreight implements Freight {

    @Override
    public double freightCalculator(Shipment shipment) {
        return 10.0 + shipment.weightKg() * 1.5;
    }
}
