package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class ProcessFile {
    public static void main(String []args){
        List<Cat> cats = loadCats("Cats.txt");
        cats.forEach(System.out::println);// just print the Cat
    }
    public static List<Cat> loadCats(String filename){
        List<Cat> cats = new ArrayList<>();
        try(Stream<String> fstream = Files.lines(Paths.get(filename))) {
            fstream.forEach(line -> {
                String[] catsArray = line.split("/");
                cats.add(new Cat(catsArray[0], catsArray[1]));
            });
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return cats;
    }
}

class Cat {
    private String name, colour;
    Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", colour=" + colour + '}';
    }
}



