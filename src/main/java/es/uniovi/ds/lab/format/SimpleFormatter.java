package es.uniovi.ds.lab.format;

import static java.lang.System.out;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;

public class SimpleFormatter {

    public void visitProgram(Program program) {
        for (Statement statement : program.statements)
            // visit(statement)
            ;
    }

    public void visitInput(Input input) {
        out.print("input ");
        visitVariable(input.variable);
        out.println(";");
    }

    public void visitPrint(Print print) {
        out.print("print ");
        // visit(print.expression);
        out.println(";");
    }

    public void visitArithmetic(Arithmetic arithmetic) {
        // visit(arithmetic.left);
        out.print(" " + arithmetic.operator + " ");
        // visit(arithmetic.right);
    }

    public void visitVariable(Variable variable) {
        out.print(variable.name);
    }

}
