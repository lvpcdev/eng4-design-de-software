package br.edu.nexuslog.legacy.freight;

import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.legacy.interfaces.Freight;

public class ExpressFreight implements Freight {
    @Override
    public double freightCalculator(Shipment shipment) {
        return 25.0 + shipment.weightKg() * 3.0;
    }
}
