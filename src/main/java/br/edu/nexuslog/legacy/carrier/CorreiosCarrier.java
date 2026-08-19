package br.edu.nexuslog.legacy.carrier;

import br.edu.nexuslog.legacy.interfaces.Carrier;

public class CorreiosCarrier implements Carrier {
    @Override
    public void callApi() {
        System.out.println("Chamando API Correios...");
    }
}
