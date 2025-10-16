package io.github.vanessaburbano.builder;

import io.github.vanessaburbano.documentation.DocumentationHtml;

public class BuilderDocumentVehicleHtml extends BuilderDocumentationVehicle {

    public BuilderDocumentVehicleHtml(){
        documentation = new DocumentationHtml();
    }

    @Override
    public void buildOrderRequest(String clientName) {
        String document = "<HTML>\n" +
                "<head>\n" +
                "    <title>Documentation </title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Client Order Request</h1>\n" +
                "    <p>Client Name: " + clientName + "</p>\n" +
                "</body>\n" +
                "</html>";
        documentation.addDocumentation(document);
    }

    @Override
    public void buildRegistrationRequest(String applicantName) {
        String document = "<HTML>\n" +
                "<head>\n" +
                "    <title>Documentation </title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Applicant Registration Request</h1>\n" +
                "    <p>Applicant Name: " + applicantName + "</p>\n" +
                "</body>\n" +
                "</html>";
        documentation.addDocumentation(document);
    }
}
