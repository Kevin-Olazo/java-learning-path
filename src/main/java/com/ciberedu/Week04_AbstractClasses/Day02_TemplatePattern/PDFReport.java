package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern;

public class PDFReport extends Report {

    @Override
    public void formatHeader() {
        System.out.println("------- PDF HEADER -------");
    }

    @Override
    public void formatBody() {
        System.out.println("      [ PDF BODY ]     ");
    }

    @Override
    public void formatFooter() {
        System.out.println("======= PDF FOOTER =======");
    }
}
