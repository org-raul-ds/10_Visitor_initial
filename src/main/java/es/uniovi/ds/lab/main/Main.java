package es.uniovi.ds.lab.main;

import java.util.List;

import es.uniovi.ds.lab.format.SimpleFormatter;
import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;
import es.uniovi.ds.lab.visitor.FormatterVisitor;

public class Main {

    public static void main(String[] args) {

        Program program = createProgram();

        // Format the program
        System.out.println("Formatted program using SimpleFormatter --------------");
        var simpleFormatter = new SimpleFormatter();
        simpleFormatter.visitProgram(program);

        System.out.println("Formatted program using FormatterVisitor -------------");
        var formatterVisitor = new FormatterVisitor();
        formatterVisitor.visitProgram(program);

        // Execute the program
        System.out.println("Executing program ------------------------------------");
        // ??

        // Translate to python
        System.out.println("Translating program to Python ------------------------");
        // ??
    }

    private static Program createProgram() {
        /*
        * input height;
        * input width;
        * print height * width;
        */

        // input height;
        var heightInput = new Input(new Variable("height"));

        // input width;
        var widthInput = new Input(new Variable("width"));

        // print height * width;
        var printResult = new Print(new Arithmetic(new Variable("height"), "*", new Variable("width")));

        // Create program
        return new Program(List.of(heightInput, widthInput, printResult));
    }

}
