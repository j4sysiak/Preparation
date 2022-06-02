package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DependencyScanner {

    public Collection<String> dependencyScanner(String url) {
        System.out.println("dependencyScanner ...");
        // return Arrays.asList("DecErr1", "DecErr2");
        // return new ArrayList(Arrays.asList("DecErr1", "DecErr2"));
        return List.of("DecErr1", "DecErr2");
    }
}
