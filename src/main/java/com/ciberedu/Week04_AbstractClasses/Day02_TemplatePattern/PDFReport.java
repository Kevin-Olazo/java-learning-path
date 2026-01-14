package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern;

public abstract class PDFReport {

    public final void generateReport() {

    }

    public abstract void formatHeader();
    public abstract void formatBody();
    public abstract void formatFooter();
}
