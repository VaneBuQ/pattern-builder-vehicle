package io.github.vanessaburbano.documentation;

public class DocumentationPdf extends Documentation {
    @Override
    public void addDocumentation(String document) {
        if (document.startsWith("<PDF>")) {
            content.add(document);
        }
    }

    @Override
    public void print() {
        System.out.println("Documentation PDF:");

        for (String line : content) {
            System.out.println(line);
        }
    }
}
