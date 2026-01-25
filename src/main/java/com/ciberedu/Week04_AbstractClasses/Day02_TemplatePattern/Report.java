package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern;

public abstract class Report {
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
    }

    public abstract void formatHeader();
    public abstract void formatBody();
    public abstract void formatFooter();
}
