package io.github.vanessaburbano.builder;

import io.github.vanessaburbano.documentation.DocumentationPdf;

public class BuilderDocumentationVehiclePdf extends BuilderDocumentationVehicle{

    public BuilderDocumentationVehiclePdf(){
        documentation = new DocumentationPdf();
    }

    @Override
    public void buildOrderRequest(String clientName) {
        String document = "<PDF> Document\n" +
                "Client Order Request\n" +
                "Client Name: " + clientName + "\n";
        documentation.addDocumentation(document);
    }

    @Override
    public void buildRegistrationRequest(String applicantName) {
        String document = "<PDF> Document\n" +
                "Applicant Registration Request\n" +
                "Applicant Name: " + applicantName + "\n";
        documentation.addDocumentation(document);
    }
}
