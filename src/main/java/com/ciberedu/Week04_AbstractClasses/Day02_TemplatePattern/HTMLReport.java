package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern;

public class HTMLReport extends Report{

    @Override
    public void formatHeader() {
        System.out.println(" <h1> HTML HEADER </h1>");
    }

    @Override
    public void formatBody() {
        System.out.println(" <body> HTML BODY </body>");
    }

    @Override
    public void formatFooter() {
        System.out.println("<footer> HTML FOOTER </footer>");
    }
}
