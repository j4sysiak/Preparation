package com.company;

public class PdfGenerator extends Generator {
    @Override
    protected void preparedData() {
        System.out.println("PdfGenerator: prepare data for PDF ...");
    }

    @Override
    protected void generateFile() {
        System.out.println("PdfGenerator: generate CSV PDF ...");
    }
}
