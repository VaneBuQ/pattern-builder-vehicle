package io.github.vanessaburbano.documentation;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentation {
    protected List<String> content = new ArrayList<>();
    public abstract void addDocumentation(String text);
    public abstract void print();
}
