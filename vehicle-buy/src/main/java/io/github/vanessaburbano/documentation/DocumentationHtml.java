package io.github.vanessaburbano.documentation;

public class DocumentationHtml extends Documentation {
    @Override
    public void addDocumentation(String document) {
        if (document.startsWith("<html>")) {
            content.add(document);
        }
    }

    @Override
    public void print() {
        System.out.println("Documentation HTML:");

        for (String line : content) {
            System.out.println(line);
        }
    }
}
