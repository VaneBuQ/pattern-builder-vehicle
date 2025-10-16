package io.github.vanessaburbano;

import io.github.vanessaburbano.builder.BuilderDocumentationVehicle;
import io.github.vanessaburbano.documentation.Documentation;

public class Seller {
    protected BuilderDocumentationVehicle builder;

    public Seller(BuilderDocumentationVehicle builder) {
        this.builder = builder;
    }

    public Documentation builder(String clientName){
        builder.buildOrderRequest(clientName);
        builder.buildRegistrationRequest(clientName);
        return builder.result();
    }
}
