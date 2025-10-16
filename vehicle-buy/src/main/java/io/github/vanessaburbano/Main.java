package io.github.vanessaburbano;

import io.github.vanessaburbano.builder.BuilderDocumentVehicleHtml;
import io.github.vanessaburbano.builder.BuilderDocumentationVehicle;
import io.github.vanessaburbano.builder.BuilderDocumentationVehiclePdf;
import io.github.vanessaburbano.documentation.Documentation;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BuilderDocumentationVehicle builder;
        System.out.println("Enter the type of document to generate PDF (1) or HTML (2): ");
        int option = reader.nextInt();
        if (option == 1) {
            builder = new BuilderDocumentationVehiclePdf();
        } else if (option == 2) {
            builder = new BuilderDocumentVehicleHtml();
        } else {
            System.out.println("Invalid option. Please enter 1 for PDF or 2 for HTML.");
            reader.close();
            return;
        }
        Seller seller = new Seller(builder);
        Documentation documentation = seller.builder("Vanessa Burbano");
        documentation.print();
    }
}