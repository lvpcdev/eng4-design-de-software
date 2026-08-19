package br.edu.nexuslog.legacy.freight;

import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.legacy.interfaces.Freight;

public class PriorityFreight implements Freight {
    @Override
    public double freightCalculator(Shipment shipment) {
        return 40.0 + shipment.weightKg() * 4.5;
    }
}
