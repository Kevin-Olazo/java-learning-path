package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern;

public class ReportGenerator {
    public static void main(String[] args) {

        Report pdfReport = new PDFReport();

        pdfReport.generateReport();
    }
}
