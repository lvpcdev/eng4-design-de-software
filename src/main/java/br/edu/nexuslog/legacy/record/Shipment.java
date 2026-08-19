package br.edu.nexuslog.legacy.record;

import br.edu.nexuslog.legacy.exceptions.InvalidWeightKg;

public record Shipment(
        long id,
        String customerName,
        double weightKg
) {
    public Shipment {
        if (weightKg <= 0.0) {
            throw new InvalidWeightKg("Peso inválido!");
        }
    }
}
