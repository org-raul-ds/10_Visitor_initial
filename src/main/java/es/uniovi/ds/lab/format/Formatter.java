package es.uniovi.ds.lab.format;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;

public class Formatter {

    public void visitProgram(Program program) {
        for (Statement statement : program.statements)
            // visit(statement)
            ;
    }

    public void visitInput(Input input) {
        System.out.print("input ");
        visitVariable(input.variable);
        System.out.println(";");
    }

    public void visitPrint(Print print) {
        System.out.print("print ");
        // visit(print.expression);
        System.out.println(";");
    }

    public void visitArithmetic(Arithmetic arithmetic) {
        // visit(arithmetic.left);
        System.out.print(" " + arithmetic.operator + " ");
        // visit(arithmetic.right);
    }

    public void visitVariable(Variable variable) {
        System.out.print(variable.name);
    }

}
