package com.company;

public class ScanFasade {
    private QualityScanner qualityScanner = new QualityScanner();
    private SecurityScanner securityScanner = new SecurityScanner();
    private DependencyScanner dependencyScanner = new DependencyScanner();
    private ReportGenerator reportGenerator = new ReportGenerator();

    public void scan(String url) {

        System.out.println("Scanning ... " + url);
        var qualityScannerError = qualityScanner.qualityScanner(url);
        var securityScannerError = securityScanner.securityScanner(url);
        var dependencyScannerError = dependencyScanner.dependencyScanner(url);

        System.out.println("Scan report");
        reportGenerator.generateReport(qualityScannerError, securityScannerError, dependencyScannerError);
    }
}
