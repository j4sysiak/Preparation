package com.company.item21;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
ERROR:
  GOLDEN RULE: overriding method cannot add another new checked exception even parent one (IOException parent of FileNotFoundException)
*/

class Graet {
    public void doStuff() throws FileNotFoundException {}
}

class Amazing extends Graet {

    @Override
    public void doStuff() throws /*ERROR: IOException,*/ IllegalArgumentException {}
}

public class TestCase {
    public static void main(String[] args) throws IOException {

        Graet g = new Amazing();
        g.doStuff();

    }
}