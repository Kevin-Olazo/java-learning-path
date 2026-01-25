package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern;

public class ExcelReport extends Report{

    @Override
    public void formatHeader() {
        System.out.println(">>>>>>>> EXCEL HEADER");
    }

    @Override
    public void formatBody() {
        System.out.println(">>> EXCEL BODY <<<");
    }

    @Override
    public void formatFooter() {
        System.out.println("EXCEL FOOTER <<<<<<<<<<<");
    }
}
