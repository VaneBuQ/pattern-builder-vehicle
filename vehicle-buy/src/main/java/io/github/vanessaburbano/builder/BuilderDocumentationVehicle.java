package io.github.vanessaburbano.builder;

import io.github.vanessaburbano.documentation.Documentation;

public abstract class BuilderDocumentationVehicle {
    protected Documentation documentation;

    public abstract void buildOrderRequest(String clientName);
    public abstract void buildRegistrationRequest(String applicantName);

    public Documentation result() {
        return documentation;
    }

}
